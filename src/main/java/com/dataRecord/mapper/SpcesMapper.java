package com.dataRecord.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dataRecord.domain.entity.Spces;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : iboyang
 * @description :
 * date : 2023/12/12
 */
@Mapper
public interface SpcesMapper extends BaseMapper<Spces> {

    Spces findSpcesByid(Integer id);
}
