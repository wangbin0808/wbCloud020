package com.wb.cloud.entitles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName : Payment
 * @Author : 王斌
 * @Date : 2020-11-18 09:36
 * @Description
 * @Version
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment implements Serializable {

    private long id;

    private String serial;
}
