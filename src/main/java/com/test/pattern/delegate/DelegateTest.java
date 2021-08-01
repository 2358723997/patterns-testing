package com.test.pattern.delegate;

/**
 * DelegateTest类
 *
 * @author wangjixue
 * @date 8/1/21 11:49 PM
 */
public class DelegateTest {
    public static void main(String[] args) {
        Task task = new Delegate();
        task.doTask(TaskType.TASK_TYPE_A.name());
        task.doTask(TaskType.TASK_TYPE_B.name());
        task.doTask("TASK_TYPE_C");
    }
}
