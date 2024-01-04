package com.dataRecord.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dataRecord.domain.entity.Inventory;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

/**
 * @author : iboyang
 * @description :
 * date : 2023/12/13
 */
@Mapper
public interface InventoryMapper extends BaseMapper<Inventory> {

    Integer findLeftInvByYearAndMonthAndSid(Integer year,Integer month,Integer sid);

    Inventory findInventoryBySIdAndMonth(Integer sId, Date date);


    List<Inventory> findInventoryByDate(Date date);
}
