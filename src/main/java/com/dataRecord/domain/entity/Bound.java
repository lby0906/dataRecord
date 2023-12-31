package com.dataRecord.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author iboyang
 * @date 2023年12月13日 16:12
 * desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("bound")
public class Bound {
    //id
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    //入库数量
    @TableField(value = "inbound_count")
    private Integer inboundCount;

    //出库数量
    @TableField(value = "outbound_count")
    private Integer outboundCount;

    //日期
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @TableField(value = "day")
    private Date day;

    @JsonIgnore
    @TableField(value = "s_id")
    private Integer sId;

    private Spces spces;
}
