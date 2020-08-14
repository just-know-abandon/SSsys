package com.lhj.sql.service;

import com.lhj.sql.model.Xueshenglist;
import com.lhj.sql.model.XueshenglistExample;
import com.lhj.sql.model.XueshenglistKey;

import java.util.List;

public interface XueshenglistService {
    public List<Xueshenglist> getXueshenglistByExample(XueshenglistExample xueshenglistExample);
    public long getCountByExample(XueshenglistExample xueshenglistExample);
    public Xueshenglist getXueshenglistByKey(XueshenglistKey xueshenglistKey);
    public int save(Xueshenglist xueshenglist);
    public int deleteByKey(XueshenglistKey xueshenglistKey);
    public int deleteByExampleAll(XueshenglistExample xueshenglistExample);
    public int updateByKey(Xueshenglist xueshenglist);
    public int updateByExampleAll(Xueshenglist xueshenglist, XueshenglistExample xueshenglistyExample);
    public List<Xueshenglist> getMenus(Integer page, Integer limit, XueshenglistExample xueshenglistExample);
}
