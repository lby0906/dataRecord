package com.dataRecord.controller;

import com.dataRecord.domain.AjaxResult;
import com.dataRecord.domain.entity.Spces;
import com.dataRecord.service.BoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

/**
 * @author iboyang
 * @date 2023年12月14日 14:36
 * desc:
 */
@RestController
@RequestMapping("/bound")
public class BoundController {

    @Autowired
    private BoundService boundService;

    @GetMapping("/dayList")
    public AjaxResult getBoundListByDate(String date) throws ParseException {
        return AjaxResult.success(boundService.findBoundByDate(date));
    }

    @GetMapping("/MonthList")
    public AjaxResult getBoundListByYearAndMonth(String date) throws ParseException {
        return AjaxResult.success(boundService.findBoundByDate(date));
    }
}
