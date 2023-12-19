package com.dataRecord.controller;

import com.dataRecord.domain.AjaxResult;
import com.dataRecord.domain.entity.Spces;
import com.dataRecord.mapper.InventoryMapper;
import com.dataRecord.service.BoundService;
import com.dataRecord.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Date;
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
    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/dayList")
    public AjaxResult getBoundListByDate(Date date) throws ParseException {
        return AjaxResult.success(boundService.findBoundByDate(date));
    }

    @GetMapping("/monthList")
    public AjaxResult getBoundListByYearAndMonth(Date date) throws ParseException {
        return AjaxResult.success(boundService.findBoundByYearAndMonth(date));
    }

    @PostMapping("/updateInBound")
    public AjaxResult updateInBound(Integer id, Integer inBound, Date date) throws ParseException {
        boundService.updateBoundInBoundById(id,inBound);
        inventoryService.updateInventoryByBound(id,date);
        return AjaxResult.success("编辑入库数量成功！");
    }

    @PostMapping("/updateOutBound")
    public AjaxResult updateOutBound(Integer id, Integer outBound, Date date) throws ParseException {
        boundService.updateBoundInBoundById(id,outBound);
        inventoryService.updateInventoryByBound(id,date);
        return AjaxResult.success("编辑出库数量成功！");
    }
}
