package com.test.pattern.decorator;

/**
 * SausageWrapper类
 *
 * @author wangjixue
 * @date 8/1/21 3:04 PM
 */
public class SausageWrapper extends BatterCakeWrapper{

    public SausageWrapper(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    public int getPrice(){
        return super.getPrice()+2;
    }

    @Override
    public String getMsg(){
        return String.join("+",super.getMsg(),"一根烤肠");
    }
}
