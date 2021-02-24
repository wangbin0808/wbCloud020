package com.wb.cloud.entitles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ClassName : Order
 * @Author : 王斌
 * @Date : 2020-12-04 20:58
 * @Description
 * @Version
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class TOrder {

    private long id;

    private long userId;

    private long productId;

    private int count ;
    private int status ;

    private BigDecimal money;


}
