package com.lhj.sql.mapper;

import com.lhj.sql.model.Baoxiulist;
import com.lhj.sql.model.BaoxiulistExample;
import com.lhj.sql.model.BaoxiulistKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaoxiulistMapper {
    long countByExample(BaoxiulistExample example);

    int deleteByExample(BaoxiulistExample example);

    int deleteByPrimaryKey(BaoxiulistKey key);

    int insert(Baoxiulist record);

    int insertSelective(Baoxiulist record);

    List<Baoxiulist> selectByExample(BaoxiulistExample example);

    Baoxiulist selectByPrimaryKey(BaoxiulistKey key);

    int updateByExampleSelective(@Param("record") Baoxiulist record, @Param("example") BaoxiulistExample example);

    int updateByExample(@Param("record") Baoxiulist record, @Param("example") BaoxiulistExample example);

    int updateByPrimaryKeySelective(Baoxiulist record);

    int updateByPrimaryKey(Baoxiulist record);
}