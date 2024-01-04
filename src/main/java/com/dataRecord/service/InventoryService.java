package com.dataRecord.service;

import com.dataRecord.domain.entity.Inventory;

import java.util.Date;
import java.util.List;

/**
 * @author : iboyang
 * @description :
 * date : 2023/12/13
 */
public interface InventoryService {

    Boolean insertInventoryBySpceses();

    Boolean updateInventoryByBound(Integer BoundId, Date date);

    List<Inventory> selectInventoryByDate(Date date);
}
