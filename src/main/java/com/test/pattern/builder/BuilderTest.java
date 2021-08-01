package com.test.pattern.builder;

/**
 * BuilderTest类
 *
 * @author wangjixue
 * @date 8/1/21 10:47 PM
 */
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new ProductBuilder()
                .addName("建造者")
                .addDate(System.currentTimeMillis())
                .addPrice(123)
                .addProductCode("CODE");

        System.err.println(builder.build());
    }
}
