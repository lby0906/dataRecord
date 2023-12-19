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
 * @date 2023年12月12日 16:27
 * desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("spces")
public class Spces {

    // 规格id
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    //规格
    @TableField(value = "spces_name")
    private String spcesName;

    //单支重
    @TableField(value = "pw")
    private Double pw;
}
