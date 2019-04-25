package com.qiuzhi.dao.mapper;

import com.vo.Reply;
import com.vo.ReplyExample;
import org.springframework.stereotype.Repository;

/**
 * ReplyMapper继承基类
 */
@Repository
public interface ReplyMapper extends MyBatisBaseDao<Reply, String, ReplyExample> {
}