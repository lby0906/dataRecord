package com.dataRecord.domain;

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
public class Spces {

    // 规格id
    private Integer id;

    //规格
    private String spces_name;

    //单支重
    private String pw;
}
