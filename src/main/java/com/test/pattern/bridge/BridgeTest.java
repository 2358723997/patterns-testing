package com.test.pattern.bridge;

/**
 * BridgeTest类
 *
 * @author wangjixue
 * @date 8/2/21 1:26 AM
 */
public class BridgeTest {
    public static void main(String[] args) {
        // 来一个实现化角色
        Implementor implementor = new ConcreteImplementorA();
        // 来一个抽象化角色，聚合实现
        Abstraction abstraction = new RefinedAbstraction(implementor);
        // 执行
        abstraction.operation();
    }
}
