package com.qiuzhi.controller;

import com.qiuzhi.dao.ArticleDao;
import com.qiuzhi.dao.mapper.ArticleDAO;
import com.qiuzhi.dao.mapper.ArticleMapper;
import com.qiuzhi.utils.IDUtil;
import com.vo.Article;
import com.vo.ArticleExample;
import com.vo.ReturnObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author qiuzhi
 * @date 2018/11/15
 * @description
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    public static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ArticleController.class);

    @Autowired
    private ArticleDAO articleDAO;


    @RequestMapping(value = "/add")
    @ResponseBody
    public ReturnObject addArticle(Article article){
        LOG.info("传入的文章内容为：" + article.getContent());
        article.setId(IDUtil.getUUID32());
        articleDAO.insert(article);
        return new ReturnObject("0","操作成功");
    }

    @RequestMapping(value = "/get/{id}")
    @ResponseBody
    public ReturnObject getArticleById(@PathVariable String id){
        Article article = articleDAO.selectByPrimaryKey(id);
        return new ReturnObject("0","操作成功",article);
    }

    @RequestMapping("/getPageInfo")
    public @ResponseBody Map<String,Object> getPageInfo(int limit, int offset,Article article) {
        LOG.info("getPageInfo? limit={}, offset={}, draw={}, qry={}", limit, offset, article.toString());
        ArticleExample articleExample = new ArticleExample();
        long totalRecord = articleDAO.countByExample(articleExample);
        articleExample.setLimit(limit);
        articleExample.setOffset((long) offset);

        if(!StringUtils.isEmpty(article.getId())){
            articleExample.createCriteria().andIdLike("%" + article.getId() + "%");
        }
        if(!StringUtils.isEmpty(article.getId())){
            articleExample.createCriteria().andContentLike("%" + article.getContent() + "%");
        }

        List<Article> articles = articleDAO.selectByExample(articleExample);
        for(Article a : articles){
            System.out.println(a);
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total", totalRecord);
        map.put("rows", articles);
        return map;
    }


}
