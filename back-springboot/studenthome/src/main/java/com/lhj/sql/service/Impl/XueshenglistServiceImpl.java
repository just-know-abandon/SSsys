package com.lhj.sql.service.Impl;

import com.lhj.sql.mapper.XueshenglistMapper;
import com.lhj.sql.model.Xueshenglist;
import com.lhj.sql.model.XueshenglistExample;
import com.lhj.sql.model.XueshenglistKey;
import com.lhj.sql.service.XueshenglistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "XueshenglistService")
@Transactional
public class XueshenglistServiceImpl implements XueshenglistService {
    @Autowired
    private XueshenglistMapper xueshenglistMapper;

    @Override
    public List<Xueshenglist> getXueshenglistByExample(XueshenglistExample xueshenglistExample) {
        return xueshenglistMapper.selectByExample(xueshenglistExample);
    }

    @Override
    public long getCountByExample(XueshenglistExample xueshenglistExample) {
        return xueshenglistMapper.countByExample(xueshenglistExample);
    }

    @Override
    public Xueshenglist getXueshenglistByKey(XueshenglistKey xueshenglistKey) {
        return xueshenglistMapper.selectByPrimaryKey(xueshenglistKey);
    }

    @Override
    public int save(Xueshenglist xueshenglist) {
        return xueshenglistMapper.insert(xueshenglist);
    }

    @Override
    public int deleteByKey(XueshenglistKey xueshenglistKey) {
        return xueshenglistMapper.deleteByPrimaryKey(xueshenglistKey);
    }

    @Override
    public int deleteByExampleAll(XueshenglistExample xueshenglistExample) {
        return xueshenglistMapper.deleteByExample(xueshenglistExample);
    }

    @Override
    public int updateByKey(Xueshenglist xueshenglist) {
        return xueshenglistMapper.updateByPrimaryKey(xueshenglist);
    }

    @Override
    public int updateByExampleAll(Xueshenglist xueshenglist, XueshenglistExample xueshenglistyExample) {
        return xueshenglistMapper.updateByExample(xueshenglist, xueshenglistyExample);
    }

    @Override
    public List<Xueshenglist> getMenus(Integer page, Integer limit, XueshenglistExample xueshenglistExample) {
        return null;
    }
}