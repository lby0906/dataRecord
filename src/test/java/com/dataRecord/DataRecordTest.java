package com.dataRecord;

import com.dataRecord.domain.entity.Bound;
import com.dataRecord.mapper.BoundMapper;
import com.dataRecord.mapper.SpcesMapper;
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


        String  year = "2023";
        String  month = "12";

        System.out.println(boundMapper.findBoundByYearAndMonth(year,month));




    }
}
