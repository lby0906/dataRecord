package com.dataRecord.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author iboyang
 * @date 2023年12月13日 15:42
 * desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("inventory")
public class Inventory {

    //库存id
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    //月初库存
    @TableField(value = "month_inv")
    private Integer monthInv;

    //剩余条数
    @TableField(value = "left_art")
    private Double leftArt;

    //剩余库存
    @TableField(value = "left_inv")
    private Integer leftInv;

    //当月入库合计
    @TableField(value = "inbound_sum")
    private Integer inboundSum;

    //当月出库合计
    @TableField(value = "outbound_sum")
    private Integer outboundSum;

    //年份
    @TableField(value = "year")
    private Integer year;

    //月份
    @TableField(value = "month")
    private Integer month;

    @TableField(value = "s_id")
    private Integer sId;

}
