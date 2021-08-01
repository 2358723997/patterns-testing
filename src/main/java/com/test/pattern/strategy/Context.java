package com.test.pattern.strategy;

/**
 * Context类
 *
 * @author wangjixue
 * @date 8/2/21 12:20 AM
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy =strategy;
    }

    public void excutor(){

        this.strategy.algorithm();
    }
}
