package com.dataRecord.service;

import com.dataRecord.domain.entity.Bound;

import java.text.ParseException;
import java.util.List;

/**
 * @author : iboyang
 * @description :
 * date : 2023/12/13
 */
public interface BoundService {

    List<Bound> findBoundByDate(String day) throws ParseException;

    List<Bound> findBoundByYearAndMonth(String year, String month);
}
