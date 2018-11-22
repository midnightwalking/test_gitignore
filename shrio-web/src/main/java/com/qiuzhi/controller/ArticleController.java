package com.qiuzhi.controller;

import com.qiuzhi.dao.mapper.ArticleMapper;
import com.qiuzhi.utils.IDUtil;
import com.vo.Article;
import com.vo.ArticleExample;
import com.vo.ReturnObject;
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
        LOG.info("传入的文章内容为：" + article.getContent());
        article.setId(IDUtil.getUUID32());
        articleMapper.insert(article);
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
        articleMapper.updateByPrimaryKey(article);
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
    public @ResponseBody Map<String,Object> getPageInfo(int limit, int offset,Article article) {
        LOG.info("getPageInfo? limit={}, offset={}, draw={}, qry={}", limit, offset, article.toString());
        ArticleExample articleExample = new ArticleExample();
        long totalRecord = articleMapper.countByExample(articleExample);
        articleExample.setLimit(limit);
        articleExample.setOffset((long) offset);

        if(!StringUtils.isEmpty(article.getTitle())){
            articleExample.createCriteria().andTitleLike("%" + article.getTitle() + "%");
        }
        if(!StringUtils.isEmpty(article.getSimpleIntroduction())){
            articleExample.createCriteria().andSimpleIntroductionLike("%" + article.getSimpleIntroduction() + "%");
        }

        List<Article> articles = articleMapper.selectByExample(articleExample);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total", totalRecord);
        map.put("rows", articles);
        return map;
    }


}
