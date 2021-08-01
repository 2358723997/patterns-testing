package com.test.pattern.strategy.v2;

/**
 * StrategyTest类
 *
 * @author wangjixue
 * @date 8/2/21 12:26 AM
 */
public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context();

        context.excutor(context.listStrategyNames().get(0));

        context.excutor(context.listStrategyNames().get(1));

    }

}
