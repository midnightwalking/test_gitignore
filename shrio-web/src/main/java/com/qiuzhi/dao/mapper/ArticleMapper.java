package com.qiuzhi.dao.mapper;

import com.vo.Article;
import com.vo.ArticleExample;
import org.springframework.stereotype.Repository;

/**
 * ArticleMapper继承基类
 */
@Repository
public interface ArticleMapper extends MyBatisBaseDao<Article, String, ArticleExample> {
}