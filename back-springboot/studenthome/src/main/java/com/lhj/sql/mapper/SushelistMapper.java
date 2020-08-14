package com.lhj.sql.mapper;

import com.lhj.sql.model.Sushelist;
import com.lhj.sql.model.SushelistExample;
import com.lhj.sql.model.SushelistKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SushelistMapper {
    long countByExample(SushelistExample example);

    int deleteByExample(SushelistExample example);

    int deleteByPrimaryKey(SushelistKey key);

    int insert(Sushelist record);

    int insertSelective(Sushelist record);

    List<Sushelist> selectByExample(SushelistExample example);

    Sushelist selectByPrimaryKey(SushelistKey key);

    int updateByExampleSelective(@Param("record") Sushelist record, @Param("example") SushelistExample example);

    int updateByExample(@Param("record") Sushelist record, @Param("example") SushelistExample example);

    int updateByPrimaryKeySelective(Sushelist record);

    int updateByPrimaryKey(Sushelist record);
}