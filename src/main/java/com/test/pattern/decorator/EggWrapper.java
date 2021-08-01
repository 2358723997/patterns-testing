package com.test.pattern.decorator;

/**
 * EggWrapper类
 *
 * @author wangjixue
 * @date 8/1/21 2:59 PM
 */
public class EggWrapper extends BatterCakeWrapper{

    public EggWrapper(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    public int getPrice(){
        return super.getPrice()+1;
    }

    @Override
    public String getMsg(){
        return String.join("+",super.getMsg(),"1个鸡蛋");
    }
}
