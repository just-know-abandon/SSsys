package com.lhj.sql.service;

import com.lhj.sql.model.Wanguilist;
import com.lhj.sql.model.WanguilistExample;
import com.lhj.sql.model.WanguilistKey;

import java.util.List;

public interface WanguilistService {
    public List<Wanguilist> getWanguilistByExample(WanguilistExample wanguilistExample);
    public long getCountByExample(WanguilistExample wanguilistExample);
    public Wanguilist getWanguilistByKey(WanguilistKey wanguilistKey);
    public int save(Wanguilist wanguilist);
    public int deleteByKey(WanguilistKey wanguilistKey);
    public int deleteByExampleAll(WanguilistExample wanguilistExample);
    public int updateByKey(Wanguilist wanguilist);
    public int updateByExampleAll(Wanguilist wanguilist, WanguilistExample wanguilistyExample);
    public List<Wanguilist> getMenus(Integer page, Integer limit, WanguilistExample wanguilistExample);
}
