package com.test.pattern.builder;

import java.util.Date;

import lombok.Data;

/**
 * Product类
 *
 * @author wangjixue
 * @date 8/1/21 10:40 PM
 */
@Data
public class Product {
    private String  name;
    private Integer price;
    private Date date;
    private String productCode;
}
