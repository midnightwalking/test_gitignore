package com.qiuzhi.controller;

import com.qiuzhi.dao.ArticleDao;
import com.qiuzhi.dao.mapper.ArticleMapper;
import com.qiuzhi.utils.IDUtil;
import com.vo.Article;
import com.vo.ReturnObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

    private final static Log logger = LogFactory.getLog(ArticleController.class);

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private ArticleMapper articleMapper;

    @RequestMapping(value = "/addArticle")
    @ResponseBody
    public ReturnObject addArticle(Article article){
        article.setId(IDUtil.getUUID32());
        articleMapper.insert(article);
        return new ReturnObject("0","操作成功");
    }
}
