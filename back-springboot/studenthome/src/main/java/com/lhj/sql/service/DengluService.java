package com.lhj.sql.service;

import com.lhj.sql.model.Denglu;
import com.lhj.sql.model.DengluExample;
import com.lhj.sql.model.DengluKey;

import java.util.List;

public interface DengluService {
    public List<Denglu> getDengluByExample(DengluExample dengluExample);
    public long getCountByExample(DengluExample dengluExample);
    public Denglu getDengluByKey(DengluKey dengluKey);
    public int save(Denglu denglu);
    public int deleteByKey(DengluKey dengluKey);
    public int deleteByExampleAll(DengluExample dengluExample);
    public int updateByKey(Denglu denglu);
    public int updateByExampleAll(Denglu denglu, DengluExample dengluyExample);
    public List<Denglu> getMenus(Integer page, Integer limit, DengluExample dengluExample);
}
