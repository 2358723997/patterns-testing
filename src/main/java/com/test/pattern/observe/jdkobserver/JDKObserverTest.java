package com.test.pattern.observe.jdkobserver;

/**
 * JDKObserverTest类
 *
 * @author wangjixue
 * @date 8/1/21 10:24 PM
 */
public class JDKObserverTest {
    public static void main(String[] args) {
        JDKObserveable observeable = JDKObserveable.getInstance();

        JDKObserver observer = new JDKObserver();
        observeable.addObserver(observer);

        observeable.notify(new Event("生产者-消费者","设计者模式"));
    }
}
