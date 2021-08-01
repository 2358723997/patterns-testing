package com.test.pattern.strategy;

/**
 * StrategyTest类
 *
 * @author wangjixue
 * @date 8/2/21 12:26 AM
 */
public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());

        context.excutor();

        context = new Context(new ConcreteStrategyB());

        context.excutor();

    }

}
