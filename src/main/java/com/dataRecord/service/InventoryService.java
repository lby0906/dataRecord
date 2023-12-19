package com.dataRecord.service;

import java.util.Date;

/**
 * @author : iboyang
 * @description :
 * date : 2023/12/13
 */
public interface InventoryService {

    Boolean insertInventoryBySpceses();

    Boolean updateInventoryByBound(Integer BoundId, Date date);
}
