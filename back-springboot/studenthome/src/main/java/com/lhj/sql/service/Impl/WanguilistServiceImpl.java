package com.lhj.sql.service.Impl;

import com.lhj.sql.mapper.WanguilistMapper;
import com.lhj.sql.model.Wanguilist;
import com.lhj.sql.model.WanguilistExample;
import com.lhj.sql.model.WanguilistKey;
import com.lhj.sql.service.WanguilistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "WanguilistService")
@Transactional
public class WanguilistServiceImpl implements WanguilistService {
    @Autowired
    private WanguilistMapper wanguilistMapper;

    @Override
    public List<Wanguilist> getWanguilistByExample(WanguilistExample wanguilistExample) {
        return wanguilistMapper.selectByExample(wanguilistExample);
    }

    @Override
    public long getCountByExample(WanguilistExample wanguilistExample) {
        return wanguilistMapper.countByExample(wanguilistExample);
    }

    @Override
    public Wanguilist getWanguilistByKey(WanguilistKey wanguilistKey) {
        return wanguilistMapper.selectByPrimaryKey(wanguilistKey);
    }

    @Override
    public int save(Wanguilist wanguilist) {
        return wanguilistMapper.insert(wanguilist);
    }

    @Override
    public int deleteByKey(WanguilistKey wanguilistKey) {
        return wanguilistMapper.deleteByPrimaryKey(wanguilistKey);
    }

    @Override
    public int deleteByExampleAll(WanguilistExample wanguilistExample) {
        return wanguilistMapper.deleteByExample(wanguilistExample);
    }

    @Override
    public int updateByKey(Wanguilist wanguilist) {
        return wanguilistMapper.updateByPrimaryKey(wanguilist);
    }

    @Override
    public int updateByExampleAll(Wanguilist wanguilist, WanguilistExample wanguilistyExample) {
        return wanguilistMapper.updateByExample(wanguilist, wanguilistyExample);
    }

    @Override
    public List<Wanguilist> getMenus(Integer page, Integer limit, WanguilistExample wanguilistExample) {
        return null;
    }
} 