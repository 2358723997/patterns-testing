package com.test.pattern.strategy.v2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Context类
 *
 * @author wangjixue
 * @date 8/2/21 12:20 AM
 */
public class Context {

    private static Map<String,Strategy> strategyMap = new HashMap<>();

    public static List<String>  strategyNameList = new ArrayList<>();

    static {
        strategyNameList.add("A");
        strategyNameList.add("B");
        strategyMap.put(strategyNameList.get(0),new ConcreteStrategyA());
        strategyMap.put(strategyNameList.get(1),new ConcreteStrategyB());
    }

    /**
     * 获取策略
     * @return
     */
    public List<String> listStrategyNames(){
        return strategyNameList;
    }

    /**
     * 执行策略
     * @param strategyName
     */
    public void excutor(String strategyName){

        if(!strategyMap.containsKey(strategyName)){
            System.err.println("无该策略："+strategyName);
            return;
        }
        strategyMap.get(strategyName).algorithm();
    }
}
