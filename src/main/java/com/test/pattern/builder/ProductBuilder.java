package com.test.pattern.builder;

import java.util.Date;

/**
 * ProductBuilder类
 *
 * @author wangjixue
 * @date 8/1/21 10:43 PM
 */
public class ProductBuilder implements Builder {

    private Product product = new Product();

    @Override
    public Product build() {
        return this.product;
    }

    @Override
    public ProductBuilder addName(String name) {
        this.product.setName(name);
        return this;
    }

    @Override
    public ProductBuilder addDate(Long time) {
        this.product.setDate(new Date(time));
        return this;
    }

    @Override
    public ProductBuilder addPrice(Integer price) {
        this.product.setPrice(price);
        return this;
    }

    @Override
    public ProductBuilder addProductCode(String productCode) {
        this.product.setProductCode(productCode);
        return this;
    }

}
