package com.qiuzhi.controller;

import com.qiuzhi.dao.mapper.ArticleMapper;
import com.qiuzhi.utils.IDUtil;
import com.qiuzhi.utils.JedisUtil;
import com.vo.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author qiuzhi
 * @date 2018/11/15
 * @description
 */
@Controller
public class ArticleController {
    public static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ArticleController.class);

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private JedisUtil jedisUtil;
    /**
     *@描述 新增文章
     *@参数 
     *@返回值  
     *@创建人  qiuzhi
     *@创建时间  2018/11/21
     */
    
    @RequestMapping(value = "/article" , method = RequestMethod.POST)
    @ResponseBody
    public ReturnObject addArticle(Article article){
        LOG.info("新增文章Begin");
//        BeanUtils.copyProperties(article,article);
        article.setId(IDUtil.getUUID32());
        article.setCreateTime(new Date());
        articleMapper.insert(article);
        List<Article> articles = new ArrayList<>();
        articles.add(article);
        jedisUtil.zSetArticles(articles);
        LOG.info("新增文章End");
        return new ReturnObject("0","操作成功");
    }

    /**
     *@描述 根据ID获取文章
     *@参数 
     *@返回值 
     *@创建人  qiuzhi
     *@创建时间  2018/11/21
     */

    @RequestMapping(value = "/article/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ReturnObject getArticleById(@PathVariable String id){
        Article article = articleMapper.selectByPrimaryKey(id);
        return new ReturnObject("0","操作成功",article);
    }

    /**
     *@描述 更新
     *@参数 
     *@返回值 
     *@创建人  qiuzhi
     *@创建时间  2018/11/21
     */

    @RequestMapping(value = "/article" , method = RequestMethod.PUT)
    @ResponseBody
    public ReturnObject updateArticleById(Article article){
        articleMapper.updateByPrimaryKeySelective(article);
        return new ReturnObject("0","操作成功");
    }


    /**
     *@描述 删除
     *@参数 
     *@返回值 
     *@创建人  qiuzhi
     *@创建时间  2018/11/21
     */

    @RequestMapping(value = "/article" , method = RequestMethod.DELETE)
    @ResponseBody
    public ReturnObject deleteArticleById(@RequestParam(value = "ids[]") String[] ids){
        try{
            ArticleExample articleExample = new ArticleExample();
            articleExample.or().andIdIn(new ArrayList<String>(Arrays.asList(ids)));
            int i = articleMapper.deleteByExample(articleExample);
            System.out.println("删除了：" + i + "条记录");
        }catch (Exception e){
            e.printStackTrace();
        }

        return new ReturnObject("0","操作成功");
    }


    /**
     *@描述 获取文章列表
     *@参数 
     *@返回值 
     *@创建人  qiuzhi
     *@创建时间  2018/11/21
     */

    @RequestMapping(value = "/articles" , method = RequestMethod.GET)
    public @ResponseBody Map<String,Object> getPageInfo(ArticleQuery query) {
        LOG.info("getPageInfo? limit={}, offset={}, draw={}, qry={}", query.getLimit(), query.getOffset(), query.toString());
        ArticleExample articleExample = new ArticleExample();
        long totalRecord = articleMapper.countByExample(articleExample);
        articleExample.setLimit(query.getLimit());
        articleExample.setOffset((long) query.getOffset());
        articleExample.setOrderByClause("CREATE_TIME DESC");// 默认创建时间倒序输出

        if(!StringUtils.isEmpty(query.getTitle())){
            articleExample.createCriteria().andTitleLike("%" + query.getTitle() + "%");
        }
        if(!StringUtils.isEmpty(query.getSimpleIntroduction())){
            articleExample.createCriteria().andSimpleIntroductionLike("%" + query.getSimpleIntroduction() + "%");
        }

        List<Article> articles = articleMapper.selectByExample(articleExample);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("retCode",0);
        map.put("total", totalRecord);
        map.put("rows", articles);
        return map;
    }

    /**
     * @Author qiuzhi
     * @Description 获取热门文章
     * @Date 15:54 2019/1/29
     * @Param []
     * @return com.vo.ReturnObject
     **/

    @RequestMapping(value = "/hotArticle", method = RequestMethod.GET)
    @ResponseBody
    public ReturnObject getHotArticle(){
        Set<String> articles = jedisUtil.getHotArticle();
        return new ReturnObject("0","操作成功",articles);
    }

    /**
     * @Author qiuzhi
     * @Description 文章点击新增点击量
     * @Date 11:12 2019/1/30
     * @Param [idTitle]
     * @return com.vo.ReturnObject
     **/

    @RequestMapping(value = "/hotArticle/{idTitle}", method = RequestMethod.GET)
    @ResponseBody
    public ReturnObject addZset(@PathVariable String idTitle){
        System.out.println(idTitle);
        jedisUtil.addScoreByKey(idTitle);
        return new ReturnObject("0","操作成功","");
    }
}
