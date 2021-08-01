package com.test.pattern.bridge;

/**
 * RefinedAbstraction类
 *
 * @author wangjixue
 * @date 8/2/21 1:22 AM
 */
public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation(){
        super.operation();
        System.err.println("RefinedAbstraction");
    }
}
