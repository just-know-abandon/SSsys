package com.lhj.sql.service;

import com.lhj.sql.model.Sushelist;
import com.lhj.sql.model.SushelistExample;
import com.lhj.sql.model.SushelistKey;

import java.util.List;

public interface SushelistService {
    public List<Sushelist> getSushelistByExample(SushelistExample sushelistExample);
    public long getCountByExample(SushelistExample sushelistExample);
    public Sushelist getSushelistByKey(SushelistKey sushelistKey);
    public int save(Sushelist sushelist);
    public int deleteByKey(SushelistKey sushelistKey);
    public int deleteByExampleAll(SushelistExample sushelistExample);
    public int updateByKey(Sushelist sushelist);
    public int updateByExampleAll(Sushelist sushelist, SushelistExample sushelistyExample);
    public List<Sushelist> getMenus(Integer page, Integer limit, SushelistExample sushelistExample);
}
