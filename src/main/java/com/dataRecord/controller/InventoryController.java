package com.dataRecord.controller;

import com.dataRecord.domain.AjaxResult;
import com.dataRecord.domain.entity.Inventory;
import com.dataRecord.domain.entity.Spces;
import com.dataRecord.service.InventoryService;
import com.dataRecord.service.SpcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author iboyang
 * @date 2023年12月13日 15:46
 * desc:
 */
@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/list")
    public AjaxResult getInventoryList(@RequestParam("date") String date) throws ParseException {
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(date);
        List<Inventory> spcesList = inventoryService.selectInventoryByDate(date1);
        return AjaxResult.success(spcesList);
    }


}
