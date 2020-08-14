package com.lhj.sql.service;

import com.lhj.sql.model.Shiwulist;
import com.lhj.sql.model.ShiwulistExample;
import com.lhj.sql.model.ShiwulistKey;

import java.util.List;

public interface ShiwulistService {
    public List<Shiwulist> getShiwulistByExample(ShiwulistExample shiwulistExample);
    public long getCountByExample(ShiwulistExample shiwulistExample);
    public Shiwulist getShiwulistByKey(ShiwulistKey shiwulistKey);
    public int save(Shiwulist shiwulist);
    public int deleteByKey(ShiwulistKey shiwulistKey);
    public int deleteByExampleAll(ShiwulistExample shiwulistExample);
    public int updateByKey(Shiwulist shiwulist);
    public int updateByExampleAll(Shiwulist shiwulist, ShiwulistExample shiwulistyExample);
    public List<Shiwulist> getMenus(Integer page, Integer limit, ShiwulistExample shiwulistExample);
}
