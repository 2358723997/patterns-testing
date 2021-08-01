package com.test.pattern.builder;

/**
 * Builder接口
 *
 * @author wangjixue
 * @date 8/1/21 10:39 PM
 */
public interface Builder {
    public Product build();

    public ProductBuilder addName(String name);

    public ProductBuilder addDate(Long time);

    public ProductBuilder addPrice(Integer price);

    public ProductBuilder addProductCode(String productCode);
}
