package com.lhj.sql.service.Impl;

import com.lhj.sql.mapper.BaoxiulistMapper;
import com.lhj.sql.model.Baoxiulist;
import com.lhj.sql.model.BaoxiulistExample;
import com.lhj.sql.model.BaoxiulistKey;
import com.lhj.sql.service.BaoxiulistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "BaoxiulistService")
@Transactional
public class BaoxiulistServiceImpl implements BaoxiulistService {
    @Autowired
    private BaoxiulistMapper baoxiulistMapper;

    @Override
    public List<Baoxiulist> getBaoxiulistByExample(BaoxiulistExample baoxiulistExample) {
        return baoxiulistMapper.selectByExample(baoxiulistExample);
    }

    @Override
    public long getCountByExample(BaoxiulistExample baoxiulistExample) {
        return baoxiulistMapper.countByExample(baoxiulistExample);
    }

    @Override
    public Baoxiulist getBaoxiulistByKey(BaoxiulistKey baoxiulistKey) {
        return baoxiulistMapper.selectByPrimaryKey(baoxiulistKey);
    }

    @Override
    public int save(Baoxiulist baoxiulist) {
        return baoxiulistMapper.insert(baoxiulist);
    }

    @Override
    public int deleteByKey(BaoxiulistKey baoxiulistKey) {
        return baoxiulistMapper.deleteByPrimaryKey(baoxiulistKey);
    }

    @Override
    public int deleteByExampleAll(BaoxiulistExample baoxiulistExample) {
        return baoxiulistMapper.deleteByExample(baoxiulistExample);
    }

    @Override
    public int updateByKey(Baoxiulist baoxiulist) {
        return baoxiulistMapper.updateByPrimaryKey(baoxiulist);
    }

    @Override
    public int updateByExampleAll(Baoxiulist baoxiulist, BaoxiulistExample baoxiulistyExample) {
        return baoxiulistMapper.updateByExample(baoxiulist, baoxiulistyExample);
    }

    @Override
    public List<Baoxiulist> getMenus(Integer page, Integer limit, BaoxiulistExample baoxiulistExample) {
        return null;
    }
}