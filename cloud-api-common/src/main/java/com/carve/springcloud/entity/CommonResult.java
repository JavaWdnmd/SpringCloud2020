package com.carve.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Function:
 * ClassName: CommonResult
 *
 * @author lmb on 2020/7/25 11:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult {
    private Integer code;
    private String message;
    private Object data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
