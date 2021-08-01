package com.test.pattern.bridge;

/**
 * ConcreteImplementorB类
 *
 * @author wangjixue
 * @date 8/2/21 1:22 AM
 */
public class ConcreteImplementorB implements Implementor{
    @Override
    public void operationImpl() {
        System.err.println("ConcreteImplementorB");
    }
}
