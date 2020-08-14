package com.lhj.sql.mapper;

import com.lhj.sql.model.Wanguilist;
import com.lhj.sql.model.WanguilistExample;
import com.lhj.sql.model.WanguilistKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WanguilistMapper {
    long countByExample(WanguilistExample example);

    int deleteByExample(WanguilistExample example);

    int deleteByPrimaryKey(WanguilistKey key);

    int insert(Wanguilist record);

    int insertSelective(Wanguilist record);

    List<Wanguilist> selectByExample(WanguilistExample example);

    Wanguilist selectByPrimaryKey(WanguilistKey key);

    int updateByExampleSelective(@Param("record") Wanguilist record, @Param("example") WanguilistExample example);

    int updateByExample(@Param("record") Wanguilist record, @Param("example") WanguilistExample example);

    int updateByPrimaryKeySelective(Wanguilist record);

    int updateByPrimaryKey(Wanguilist record);
}