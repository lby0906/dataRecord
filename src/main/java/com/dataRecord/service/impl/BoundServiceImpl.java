package com.dataRecord.service.impl;

import com.dataRecord.domain.entity.Bound;
import com.dataRecord.mapper.BoundMapper;
import com.dataRecord.service.BoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author iboyang
 * @date 2023年12月14日 14:32
 * desc:
 */
@Service
public class BoundServiceImpl implements BoundService {

    @Autowired
    private BoundMapper boundMapper;

    @Override
    public List<Bound> findBoundByDate(String day) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        day = day.replaceAll("[^0-9\\-]", "");
        Date date = sdf.parse(day);
        System.out.println(date);
        return boundMapper.findBoundByDate(date);
    }

    @Override
    public List<Bound> findBoundByYearAndMonth(String year, String month) {
        return boundMapper.findBoundByYearAndMonth(year,month);
    }
}
