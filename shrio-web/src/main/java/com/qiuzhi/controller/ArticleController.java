package com.qiuzhi.controller;

import com.qiuzhi.dao.ArticleDao;
import com.qiuzhi.dao.mapper.ArticleMapper;
import com.qiuzhi.utils.IDUtil;
import com.vo.Article;
import com.vo.ArticleExample;
import com.vo.ReturnObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    private final static Log logger = LogFactory.getLog(ArticleController.class);

    @Autowired
    private ArticleMapper articleMapper;

    @RequestMapping(value = "/add")
    @ResponseBody
    public ReturnObject addArticle(Article article){
        logger.info("传入的文章内容为：" + article.getContent());
        article.setId(IDUtil.getUUID32());
        articleMapper.insert(article);
        return new ReturnObject("0","操作成功");
    }

    @RequestMapping(value = "/get/{id}")
    @ResponseBody
    public ReturnObject getArticleById(@PathVariable String id){
        Article article = articleMapper.selectByPrimaryKey(id);
        return new ReturnObject("0","操作成功",article);
    }

    @RequestMapping("/getPageInfo")
    public @ResponseBody Map<String,Object> getPageInfo(int limit, int offset) {
        System.out.println("limit is:"+limit);
        System.out.println("offset is:"+offset);
        ArticleExample articleExample = new ArticleExample();
        long totalRecord = articleMapper.countByExample(articleExample);
        articleExample.setLimit(limit);
        articleExample.setOffset(offset);
        List<Article> articles = articleMapper.selectByExample(articleExample);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total", totalRecord);
        map.put("rows", articles);
        return map;
    }


}
