package com.qiuzhi.dao.mapper;

import com.vo.Imginfo;
import com.vo.ImginfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface ImginfoMapper {
    long countByExample(ImginfoExample example);

    int deleteByExample(ImginfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Imginfo record);

    int insertSelective(Imginfo record);

    List<Imginfo> selectByExample(ImginfoExample example);

    Imginfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Imginfo record, @Param("example") ImginfoExample example);

    int updateByExample(@Param("record") Imginfo record, @Param("example") ImginfoExample example);

    int updateByPrimaryKeySelective(Imginfo record);

    int updateByPrimaryKey(Imginfo record);
}