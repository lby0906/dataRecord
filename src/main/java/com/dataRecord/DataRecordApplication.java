package com.dataRecord;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author iboyang
 * @date 2023年12月11日 19:54
 * desc:
 */
@MapperScan("com.dataRecord.mapper")
@SpringBootApplication
public class DataRecordApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataRecordApplication.class, args);
    }
}
