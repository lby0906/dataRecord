package com.dataRecord.service;

import com.dataRecord.domain.entity.Bound;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * @author : iboyang
 * @description :
 * date : 2023/12/13
 */
public interface BoundService {

    List<Bound> findBoundByDate(Date day) throws ParseException;

    List<Bound> findBoundByYearAndMonth(Date day) throws ParseException;

    Boolean insertBoundBySpceses();

    Boolean updateBoundInBoundById(Integer id,Integer inBoundCount);

    Boolean updateBoundOutnBoundById(Integer id,Integer outBoundCount);
}
