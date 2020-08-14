package com.lhj.sql.mapper;

import com.lhj.sql.model.Shiwulist;
import com.lhj.sql.model.ShiwulistExample;
import com.lhj.sql.model.ShiwulistKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShiwulistMapper {
    long countByExample(ShiwulistExample example);

    int deleteByExample(ShiwulistExample example);

    int deleteByPrimaryKey(ShiwulistKey key);

    int insert(Shiwulist record);

    int insertSelective(Shiwulist record);

    List<Shiwulist> selectByExample(ShiwulistExample example);

    Shiwulist selectByPrimaryKey(ShiwulistKey key);

    int updateByExampleSelective(@Param("record") Shiwulist record, @Param("example") ShiwulistExample example);

    int updateByExample(@Param("record") Shiwulist record, @Param("example") ShiwulistExample example);

    int updateByPrimaryKeySelective(Shiwulist record);

    int updateByPrimaryKey(Shiwulist record);
}