package com.dataRecord.service.impl;

import com.dataRecord.domain.entity.Spces;
import com.dataRecord.mapper.SpcesMapper;
import com.dataRecord.service.SpcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;


/**
 * @author iboyang
 * @date 2023年12月12日 20:27
 * desc:
 */
@Service
public class SpcesServiceImpl implements SpcesService {

    @Autowired
    private SpcesMapper spcesMapper;

    @Override
    public List<Spces> getSpcesList() {
        List<Spces> spcesList = spcesMapper.selectList(null);
        return spcesList;
    }

    @Override
    public boolean addSpces(Spces spces) {
        int insert = spcesMapper.insert(spces);
        if(insert > 0){
            return true;
        }
        return false;
    }
}
