package com.dataRecord.service.impl;

import com.dataRecord.domain.entity.Bound;
import com.dataRecord.domain.entity.Spces;
import com.dataRecord.mapper.BoundMapper;
import com.dataRecord.mapper.SpcesMapper;
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
    @Autowired
    private SpcesMapper spcesMapper;

    @Override
    public List<Bound> findBoundByDate(Date day) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return boundMapper.findBoundByDate(sdf.parse(sdf.format(day)));
    }

    @Override
    public List<Bound> findBoundByYearAndMonth(Date date) {
        return boundMapper.findBoundByYearAndMonth(date);
    }

    @Override
    public Boolean insertBoundBySpceses() {
        List<Spces> spcesList = spcesMapper.selectList(null);
        int count = 0;
        for (Spces spces: spcesList) {
            Bound bound = new Bound();
            bound.setDay(new Date());
            bound.setSId(spces.getId());
            bound.setInboundCount(0);
            bound.setOutboundCount(0);
            boundMapper.insert(bound);
            count++;
        }
        if (count == spcesList.size()){
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateBoundInBoundById(Integer Id, Integer inBoundCount) {
        Bound bound = new Bound();
        bound.setInboundCount(inBoundCount);

        if (boundMapper.updateById(bound) > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateBoundOutnBoundById(Integer id, Integer outBoundCount) {
        Bound bound = new Bound();
        bound.setInboundCount(outBoundCount);

        if (boundMapper.updateById(bound) > 0){
            return true;
        }
        return false;
    }
}
