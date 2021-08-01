package com.test.pattern.strategy;

/**
 * ConcreteStrategyA类
 *
 * @author wangjixue
 * @date 8/2/21 12:20 AM
 */
public class ConcreteStrategyB implements Strategy{
    @Override
    public void algorithm() {
        System.err.println("ConcreteStrategyB");
    }
}
