package com.test.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * Delegate接口
 *
 * @author wangjixue
 * @date 8/1/21 11:46 PM
 */
public class Delegate implements Task{
    private static Map<String,Task> map = new HashMap<>(2);

    static {
        map.put(TaskType.TASK_TYPE_A.name(),new ConcreteA());
        map.put(TaskType.TASK_TYPE_B.name(),new ConcreteB());
    }

    @Override
    public void doTask(String taskName) {
        if(!map.containsKey(taskName)){
            System.err.println("无法完成任务："+taskName);
            return;
        }
        map.get(taskName).doTask(taskName);
    }
}
