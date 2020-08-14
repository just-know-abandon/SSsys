package com.lhj.sql.service.Impl;

import com.lhj.sql.mapper.SushelistMapper;
import com.lhj.sql.model.Sushelist;
import com.lhj.sql.model.SushelistExample;
import com.lhj.sql.model.SushelistKey;
import com.lhj.sql.service.SushelistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "SushelistService")
@Transactional
public class SushelistServiceImpl implements SushelistService {
    @Autowired
    private SushelistMapper sushelistMapper;

    @Override
    public List<Sushelist> getSushelistByExample(SushelistExample sushelistExample) {
        return sushelistMapper.selectByExample(sushelistExample);
    }

    @Override
    public long getCountByExample(SushelistExample sushelistExample) {
        return sushelistMapper.countByExample(sushelistExample);
    }

    @Override
    public Sushelist getSushelistByKey(SushelistKey sushelistKey) {
        return sushelistMapper.selectByPrimaryKey(sushelistKey);
    }

    @Override
    public int save(Sushelist sushelist) {
        return sushelistMapper.insert(sushelist);
    }

    @Override
    public int deleteByKey(SushelistKey sushelistKey) {
        return sushelistMapper.deleteByPrimaryKey(sushelistKey);
    }

    @Override
    public int deleteByExampleAll(SushelistExample sushelistExample) {
        return sushelistMapper.deleteByExample(sushelistExample);
    }

    @Override
    public int updateByKey(Sushelist sushelist) {
        return sushelistMapper.updateByPrimaryKey(sushelist);
    }

    @Override
    public int updateByExampleAll(Sushelist sushelist, SushelistExample sushelistyExample) {
        return sushelistMapper.updateByExample(sushelist, sushelistyExample);
    }

    @Override
    public List<Sushelist> getMenus(Integer page, Integer limit, SushelistExample sushelistExample) {
        return null;
    }
}