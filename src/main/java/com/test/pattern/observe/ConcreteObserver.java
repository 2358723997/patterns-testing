package com.test.pattern.observe;

/**
 * ConcreteObserverç±»
 *
 * @author wangjixue
 * @date 8/1/21 9:55 PM
 */
public class ConcreteObserver<T> implements IObserver<T>{
    @Override
    public void update(T event) {

        System.err.println(event);
    }
}
