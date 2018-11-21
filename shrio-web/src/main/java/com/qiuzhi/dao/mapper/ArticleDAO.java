package com.qiuzhi.dao.mapper;

import com.vo.Article;
import com.vo.ArticleExample;
import org.springframework.stereotype.Repository;

/**
 * ArticleDAO继承基类
 */
@Repository
public interface ArticleDAO extends MyBatisBaseDao<Article, String, ArticleExample> {

    int mydelete(String id);
}