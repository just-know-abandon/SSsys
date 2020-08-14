package com.lhj.sql.mapper;

import com.lhj.sql.model.Denglu;
import com.lhj.sql.model.DengluExample;
import com.lhj.sql.model.DengluKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DengluMapper {
    long countByExample(DengluExample example);

    int deleteByExample(DengluExample example);

    int deleteByPrimaryKey(DengluKey key);

    int insert(Denglu record);

    int insertSelective(Denglu record);

    List<Denglu> selectByExample(DengluExample example);

    Denglu selectByPrimaryKey(DengluKey key);

    int updateByExampleSelective(@Param("record") Denglu record, @Param("example") DengluExample example);

    int updateByExample(@Param("record") Denglu record, @Param("example") DengluExample example);

    int updateByPrimaryKeySelective(Denglu record);

    int updateByPrimaryKey(Denglu record);
}