package com.qiuzhi.services;

import com.qiuzhi.dao.mapper.ArticleMapper;
import com.qiuzhi.utils.JedisUtil;
import com.vo.Article;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName InitHotServices
 * @Description 同步数据库中文章插入到redis zset 中
 * @Author MG01949
 * @Date 2019/1/29 15:15
 **/
public class InitHotServices {

	public static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(InitHotServices.class);

	@Autowired
	private ArticleMapper articleMapper;

	@Autowired
	private JedisUtil jedisUtil;
	/**
	 * @Author qiuzhi
	 * @Description 初始化排行榜
	 * @Date 15:48 2019/1/29
	 * @Param []
	 * @return void
	 **/

	private void initHotArticle()throws Exception{
		List<Article> articles = articleMapper.getNotZsetList();
		jedisUtil.zSetArticles(articles);
		LOG.info("执行初始化排行榜,共有" + articles.size() + ",篇文章被加入到排行榜中");
	}

}
