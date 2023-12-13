package com.dataRecord;

import com.dataRecord.domain.entity.Bound;
import com.dataRecord.mapper.BoundMapper;
import com.dataRecord.mapper.SpcesMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
    public void test(){
//        System.out.println(spcesMapper.selectById(160));

//        System.out.println(spcesMapper.findSpcesByid(1));

//        Bound bound = boundMapper.selectById(1);
//
//        System.out.println(bound);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = new Date();
        boundMapper.findBoundByDate(date);

    }
}
