package com.wb.cloud.entitles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName : CommonResult
 * @Author : 王斌
 * @Date : 2020-11-18 09:37
 * @Description
 * @Version
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommonResult<T> {

    private long code;

    private String message;

    private T data;

    public CommonResult(long code, String message) {
        this.code = code;
        this.message = message;
    }
}
