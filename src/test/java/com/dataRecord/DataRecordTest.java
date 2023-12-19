package com.dataRecord;

import java.util.Calendar;

import com.dataRecord.domain.entity.Bound;
import com.dataRecord.domain.entity.Spces;
import com.dataRecord.mapper.BoundMapper;
import com.dataRecord.mapper.InventoryMapper;
import com.dataRecord.mapper.SpcesMapper;
import com.dataRecord.service.InventoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author iboyang
 * @date 2023年12月13日 10:37
 * desc:
 */
@SpringBootTest
public class DataRecordTest {

    @Autowired
    private SpcesMapper spcesMapper;
    @Autowired
    private BoundMapper boundMapper;
    @Autowired
    private InventoryService inventoryService;

    @Test
    public void test() throws ParseException {
//        System.out.println(spcesMapper.selectById(160));

//        System.out.println(spcesMapper.findSpcesByid(1));

//        Bound bound = boundMapper.selectById(1);
//
//        System.out.println(bound);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

//        Date date = new Date();

//        String format = sdf.format(date);

//        Bound boundById = boundMapper.findBoundById(1);
//
//        String strDate = "2023-12-13";
////
//        Date date = sdf.parse(strDate);
////
//        Bound boundByDate = boundMapper.findBoundByDate(date);
//        System.out.println(boundByDate);


//        String  year = "2023";
//        String  month = "12";

//        System.out.println(boundMapper.findBoundByYearAndMonth(year,month));


//        List<Spces> spcesList = spcesMapper.selectList(null);
//        System.out.println(spcesList.size());

//        List<Bound> boundList = boundMapper.findBoundByYearAndMonth(new Date());
//
//        for (Bound bound : boundList) {
//            System.out.println(bound);
//        }


//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.get(Calendar.MONTH));
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.DATE));

//        calendar.add(Calendar.MONTH, -1);
//        int previousMonth = calendar.get(Calendar.MONTH) + 1;
//        calendar.add(Calendar.YEAR, -1);
//        int previousYear = calendar.get(Calendar.YEAR);
//
//        System.out.println(previousMonth);
//        System.out.println(previousYear);


//        Integer leftInv = inventoryMapper.findLeftInvByYearAndMonthAndSid(2023, 20, 1);
//        System.out.println(leftInv);

        inventoryService.updateInventoryByBound(1, new Date());


//
//        for (Spces spces : spcesList) {
//            Bound bound = new Bound();
//            bound.setSId(spces.getId());
//            bound.setDay(new Date());
//            boundMapper.insert(bound);
//        }


//        List<Bound> bounds = boundMapper.findBoundByDate(sdf.parse(sdf.format(new Date())));
//        for (Bound bound : bounds) {
//            System.out.println(bound);
//        }


    }
}
