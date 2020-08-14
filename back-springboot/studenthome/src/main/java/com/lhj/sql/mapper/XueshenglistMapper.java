package com.lhj.sql.mapper;

import com.lhj.sql.model.Xueshenglist;
import com.lhj.sql.model.XueshenglistExample;
import com.lhj.sql.model.XueshenglistKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XueshenglistMapper {
    long countByExample(XueshenglistExample example);

    int deleteByExample(XueshenglistExample example);

    int deleteByPrimaryKey(XueshenglistKey key);

    int insert(Xueshenglist record);

    int insertSelective(Xueshenglist record);

    List<Xueshenglist> selectByExample(XueshenglistExample example);

    Xueshenglist selectByPrimaryKey(XueshenglistKey key);

    int updateByExampleSelective(@Param("record") Xueshenglist record, @Param("example") XueshenglistExample example);

    int updateByExample(@Param("record") Xueshenglist record, @Param("example") XueshenglistExample example);

    int updateByPrimaryKeySelective(Xueshenglist record);

    int updateByPrimaryKey(Xueshenglist record);
}