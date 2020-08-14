package com.lhj.sql.service;

import com.lhj.sql.model.Baoxiulist;
import com.lhj.sql.model.BaoxiulistExample;
import com.lhj.sql.model.BaoxiulistKey;

import java.util.List;

public interface BaoxiulistService {
    public List<Baoxiulist> getBaoxiulistByExample(BaoxiulistExample baoxiulistExample);
    public long getCountByExample(BaoxiulistExample baoxiulistExample);
    public Baoxiulist getBaoxiulistByKey(BaoxiulistKey baoxiulistKey);
    public int save(Baoxiulist baoxiulist);
    public int deleteByKey(BaoxiulistKey baoxiulistKey);
    public int deleteByExampleAll(BaoxiulistExample baoxiulistExample);
    public int updateByKey(Baoxiulist baoxiulist);
    public int updateByExampleAll(Baoxiulist baoxiulist, BaoxiulistExample baoxiulistyExample);
    public List<Baoxiulist> getMenus(Integer page, Integer limit, BaoxiulistExample baoxiulistExample);
}
