package com.dataRecord.handler;

import com.dataRecord.service.BoundService;
import com.dataRecord.service.InventoryService;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author iboyang
 * @date 2023年12月18日 17:58
 * desc:
 */
@Component
public class XxlHandler {
    
    @Autowired
    private BoundService boundService;
    @Autowired
    private InventoryService inventoryService;
    
    @XxlJob("Demo")
    public ReturnT<String> demo(){
        String param = XxlJobHelper.getJobParam();
//        yyyy年MM月dd日HH时mm分ss秒
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        XxlJobHelper.log("测试开始");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(param + "\t----" +sdf.format(new Date()));
        System.out.println("测试完成！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
        System.out.println();
        System.out.println();
        System.out.println();
        XxlJobHelper.log("测试结束");
        return ReturnT.SUCCESS;
    }

    @XxlJob("insrtBound_Day")
    public ReturnT<String> insrtBound_Day(){
        String param = XxlJobHelper.getJobParam();
        XxlJobHelper.log(param + "任务开始执行 --------------->");
        if (boundService.insertBoundBySpceses()){
            XxlJobHelper.log(param + "任务执行完毕，执行通过 --------------->");
            return ReturnT.SUCCESS;
        }
        XxlJobHelper.log(param + "任务执行完毕，执行失败 --------------->");
        return ReturnT.FAIL;
    }

    @XxlJob("insrtInventory_Month")
    public ReturnT<String> insrtInventory_Month(){
        String param = XxlJobHelper.getJobParam();
        XxlJobHelper.log(param + "任务开始执行 --------------->");
        if (inventoryService.insertInventoryBySpceses()){
            XxlJobHelper.log(param + "任务执行完毕，执行通过 --------------->");
            return ReturnT.SUCCESS;
        }
        XxlJobHelper.log(param + "任务执行完毕，执行失败 --------------->");
        return ReturnT.FAIL;
    }
}
