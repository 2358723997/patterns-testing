package com.test.pattern.bridge;

/**
 * ConcreteImplementorAç±»
 *
 * @author wangjixue
 * @date 8/2/21 1:22 AM
 */
public class ConcreteImplementorA implements Implementor{
    @Override
    public void operationImpl() {
        System.err.println("ConcreteImplementorA");
    }
}
