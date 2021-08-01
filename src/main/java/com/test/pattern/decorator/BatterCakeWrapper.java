package com.test.pattern.decorator;

/**
 * BatterCakeWrapper类
 *
 * @author wangjixue
 * @date 8/1/21 2:57 PM
 */
public class BatterCakeWrapper extends BatterCake{

    private BatterCake batterCake;

    public BatterCakeWrapper(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    public int getPrice() {
        return this.batterCake.getPrice();
    }

    @Override
    public String getMsg() {
        return this.batterCake.getMsg();
    }
}
