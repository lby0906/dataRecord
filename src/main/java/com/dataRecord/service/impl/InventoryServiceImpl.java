package com.dataRecord.service.impl;

import com.dataRecord.domain.entity.Bound;
import com.dataRecord.domain.entity.Inventory;
import com.dataRecord.domain.entity.Spces;
import com.dataRecord.mapper.BoundMapper;
import com.dataRecord.mapper.InventoryMapper;
import com.dataRecord.mapper.SpcesMapper;
import com.dataRecord.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author iboyang
 * @date 2023年12月19日 15:13
 * desc:
 */
@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private SpcesMapper spcesMapper;
    @Autowired
    private BoundMapper boundMapper;
    @Autowired
    private InventoryMapper inventoryMapper;


    @Override
    public Boolean insertInventoryBySpceses() {
        List<Spces> spcesList = spcesMapper.selectList(null);
        Calendar calendar = Calendar.getInstance();

        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        int previousMonth = currentMonth - 1;

        int count = 0;
        for (Spces spces : spcesList) {
            Inventory inventory = new Inventory();
            inventory.setYear(currentYear);
            inventory.setMonth(currentMonth);
            inventory.setSId(spces.getId());
            if (previousMonth == 0) {
                Integer previousMonthLeftInv = inventoryMapper.findLeftInvByYearAndMonthAndSid(currentYear - 1, 12, spces.getId());
            }
            Integer previousMonthLeftInv = inventoryMapper.findLeftInvByYearAndMonthAndSid(currentYear, previousMonth, spces.getId());
            inventory.setMonthInv(previousMonthLeftInv);//获取上一月的剩余库存设置为当月的月初库存
            inventory.setLeftInv(previousMonthLeftInv);//剩余库存=月初库存+入库-出库 月初无入库出库
            Double leftArt = previousMonthLeftInv / spces.getPw() * 1000;
            BigDecimal bigDecimal = new BigDecimal(leftArt);
            bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
            inventory.setLeftArt(bigDecimal.doubleValue());//剩余库存/单只重
            inventory.setInboundSum(0);//入库总计  月初无入库出库
            inventory.setOutboundSum(0);//出库总计  月初无入库出库
            inventoryMapper.insert(inventory);
            count++;
        }
        if (count == spcesList.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateInventoryByBound(Integer BoundId, Date date) {
        Bound bound = boundMapper.findBoundById(BoundId);

        List<Bound> boundList = boundMapper.findBoundBySIdAndDate(bound.getSId(), date);
        Inventory inventory = inventoryMapper.findInventoryBySIdAndMonth(bound.getSId(), date);

        Integer newLeftInv = inventory.getMonthInv();
        Integer inBoundSum = 0;
        Integer outBoundSum = 0;

        for (Bound b : boundList) {
            newLeftInv = newLeftInv + b.getInboundCount() - b.getOutboundCount();
            inBoundSum = inBoundSum + b.getInboundCount();
            outBoundSum = outBoundSum + b.getOutboundCount();
        }

        inventory.setLeftInv(newLeftInv);
        Spces spces = spcesMapper.selectById(bound.getSId());
        Double leftArt = newLeftInv / spces.getPw() * 1000;
        BigDecimal bigDecimal = new BigDecimal(leftArt);
        bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        inventory.setLeftArt(bigDecimal.doubleValue());
        inventory.setInboundSum(inBoundSum);
        inventory.setOutboundSum(outBoundSum);

        if (inventoryMapper.updateById(inventory) > 0) {
            return true;
        }
        return false;
    }
}
