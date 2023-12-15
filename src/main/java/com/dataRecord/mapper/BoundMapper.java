package com.dataRecord.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dataRecord.domain.entity.Bound;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

/**
 * @author : iboyang
 * @description :
 * date : 2023/12/13
 */
@Mapper
public interface BoundMapper extends BaseMapper<Bound> {

    List<Bound> findBoundByDate(Date day);

    Bound findBoundById(Integer id);

    List<Bound> findBoundByYearAndMonth(String year, String month);

}
