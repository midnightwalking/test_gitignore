package com.qiuzhi.controller;

import com.qiuzhi.dao.mapper.ReplyMapper;
import com.qiuzhi.utils.IDUtil;
import com.vo.Reply;
import com.vo.ReplyExample;
import com.vo.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName ReplyController
 * @Description TODO
 * @Author MG01949
 * @Date 2019/1/30 16:24
 **/
@Controller
@RequestMapping(value = "/reply")
public class ReplyController {

	public static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ReplyController.class);

	@Autowired
	private ReplyMapper replyMapper;

	/**
	 * @Author qiuzhi
	 * @Description 添加评论
	 * @Date 16:38 2019/1/30
	 * @Param [reply]
	 * @return com.vo.ReturnObject
	 **/

	@RequestMapping(value = "/replyArticle", method = RequestMethod.POST)
	@ResponseBody
	public ReturnObject reply(Reply reply){
		LOG.info("文章添加新评论Begin,文章ID：" + reply.getRelativeArticleid());
		System.out.println("回复对象" + reply);
		reply.setReplyId(IDUtil.getUUID32());
		reply.setReplyName("游客");
		replyMapper.insert(reply);
		return new ReturnObject("0","操作成功");
	}

	/**
	 * @Author qiuzhi
	 * @Description 根据文章ID查询评论
	 * @Date 16:38 2019/1/30
	 * @Param [articleId]
	 * @return com.vo.ReturnObject
	 **/

	@RequestMapping(value = "/getArticleReply/{articleId}",method = RequestMethod.GET)
	@ResponseBody
	public ReturnObject getReply(@PathVariable String articleId){
		ReplyExample replyExample = new ReplyExample();
		replyExample.or().andRelativeArticleidEqualTo(articleId);
		List<Reply> replies = replyMapper.selectByExample(replyExample);
		return new ReturnObject("0","操作成功",replies);
	}

}
