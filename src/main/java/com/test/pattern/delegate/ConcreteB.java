package com.test.pattern.delegate;

/**
 * ConcreteA类
 *
 * @author wangjixue
 * @date 8/1/21 11:49 PM
 */
public class ConcreteB implements Task{
    @Override
    public void doTask(String taskName) {
        System.err.println("ConcreteB 已完成任务："+taskName);
    }
}
