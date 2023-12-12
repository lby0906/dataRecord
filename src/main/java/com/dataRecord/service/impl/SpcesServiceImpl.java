package com.dataRecord.service.impl;

import com.dataRecord.mapper.SpcesMapper;
import com.dataRecord.service.SpcesService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author iboyang
 * @date 2023年12月12日 20:27
 * desc:
 */
public class SpcesServiceImpl implements SpcesService {

    @Autowired
    private SpcesMapper spcesMapper;

    @Override
    public void test() {
        spcesMapper.selectById(1);
    }
}
