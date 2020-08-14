package com.lhj.sql.service.Impl;

import com.lhj.sql.mapper.DengluMapper;
import com.lhj.sql.model.Denglu;
import com.lhj.sql.model.DengluExample;
import com.lhj.sql.model.DengluKey;
import com.lhj.sql.service.DengluService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "DengluService")
@Transactional
public class DengluServiceImpl implements DengluService {
    @Autowired
    private DengluMapper dengluMapper;

    @Override
    public List<Denglu> getDengluByExample(DengluExample dengluExample) {
        return dengluMapper.selectByExample(dengluExample);
    }

    @Override
    public long getCountByExample(DengluExample dengluExample) {
        return dengluMapper.countByExample(dengluExample);
    }

    @Override
    public Denglu getDengluByKey(DengluKey dengluKey) {
        return dengluMapper.selectByPrimaryKey(dengluKey);
    }

    @Override
    public int save(Denglu denglu) {
        return dengluMapper.insert(denglu);
    }

    @Override
    public int deleteByKey(DengluKey dengluKey) {
        return dengluMapper.deleteByPrimaryKey(dengluKey);
    }

    @Override
    public int deleteByExampleAll(DengluExample dengluExample) {
        return dengluMapper.deleteByExample(dengluExample);
    }

    @Override
    public int updateByKey(Denglu denglu) {
        return dengluMapper.updateByPrimaryKey(denglu);
    }

    @Override
    public int updateByExampleAll(Denglu denglu, DengluExample dengluyExample) {
        return dengluMapper.updateByExample(denglu, dengluyExample);
    }

    @Override
    public List<Denglu> getMenus(Integer page, Integer limit, DengluExample dengluExample) {
        return null;
    }
}