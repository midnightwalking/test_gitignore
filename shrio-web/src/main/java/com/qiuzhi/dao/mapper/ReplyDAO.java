package com.qiuzhi.dao.mapper;

import com.vo.Reply;
import com.vo.ReplyExample;
import org.springframework.stereotype.Repository;

/**
 * ReplyDAO继承基类
 */
@Repository
public interface ReplyDAO extends MyBatisBaseDao<Reply, String, ReplyExample> {
}