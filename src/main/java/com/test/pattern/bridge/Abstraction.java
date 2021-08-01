package com.test.pattern.bridge;

/**
 * Abstraction类
 *
 * @author wangjixue
 * @date 8/2/21 1:21 AM
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    public void operation(){
        this.implementor.operationImpl();
    }
}
