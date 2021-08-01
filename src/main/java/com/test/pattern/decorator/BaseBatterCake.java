package com.test.pattern.decorator;

/**
 * BaseBatterCake类
 *
 * @author wangjixue
 * @date 8/1/21 2:55 PM
 */
public class BaseBatterCake extends BatterCake{
    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String getMsg() {
        return "煎饼";
    }
}
