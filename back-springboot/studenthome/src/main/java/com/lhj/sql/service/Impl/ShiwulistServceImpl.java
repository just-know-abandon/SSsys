package com.lhj.sql.service.Impl;

import com.lhj.sql.mapper.ShiwulistMapper;
import com.lhj.sql.model.Shiwulist;
import com.lhj.sql.model.ShiwulistExample;
import com.lhj.sql.model.ShiwulistKey;
import com.lhj.sql.service.ShiwulistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "ShiwulistService")
@Transactional
public class ShiwulistServceImpl implements ShiwulistService {
    @Autowired
    private ShiwulistMapper shiwulistMapper;

    @Override
    public List<Shiwulist> getShiwulistByExample(ShiwulistExample shiwulistExample) {
        return shiwulistMapper.selectByExample(shiwulistExample);
    }

    @Override
    public long getCountByExample(ShiwulistExample shiwulistExample) {
        return shiwulistMapper.countByExample(shiwulistExample);
    }

    @Override
    public Shiwulist getShiwulistByKey(ShiwulistKey shiwulistKey) {
        return shiwulistMapper.selectByPrimaryKey(shiwulistKey);
    }

    @Override
    public int save(Shiwulist shiwulist) {
        return shiwulistMapper.insert(shiwulist);
    }

    @Override
    public int deleteByKey(ShiwulistKey shiwulistKey) {
        return shiwulistMapper.deleteByPrimaryKey(shiwulistKey);
    }

    @Override
    public int deleteByExampleAll(ShiwulistExample shiwulistExample) {
        return shiwulistMapper.deleteByExample(shiwulistExample);
    }

    @Override
    public int updateByKey(Shiwulist shiwulist) {
        return shiwulistMapper.updateByPrimaryKey(shiwulist);
    }

    @Override
    public int updateByExampleAll(Shiwulist shiwulist, ShiwulistExample shiwulistyExample) {
        return shiwulistMapper.updateByExample(shiwulist, shiwulistyExample);
    }

    @Override
    public List<Shiwulist> getMenus(Integer page, Integer limit, ShiwulistExample shiwulistExample) {
        return null;
    }
}
