package com.qiuzhi.controller;

import com.qiuzhi.dao.ArticleDao;
import com.vo.Article;
import com.vo.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qiuzhi
 * @date 2018/11/15
 * @description
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleDao articleDao;

    @RequestMapping(value = "/addArticle")
    @ResponseBody
    public ReturnObject addArticle(Article article){
        article.setId(123456);
        System.out.println(article.getContent());
        articleDao.addArticle(article);
        return new ReturnObject("0","操作成功");
    }
}
