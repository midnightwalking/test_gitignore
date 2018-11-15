package com.qiuzhi.dao.impl;

import com.qiuzhi.dao.ArticleDao;
import com.vo.Article;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author qiuzhi
 * @date 2018/11/15
 * @description
 */
@Component
public class ArticleDaoImpl implements ArticleDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addArticle(Article article) {
        String sql = "insert into article values(?,?)";

        jdbcTemplate.update(sql, article.getId(), article.getContent());
    }
}
