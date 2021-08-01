package com.test.pattern.observe.jdkobserver;

import java.util.Observable;
import java.util.Observer;

import com.alibaba.fastjson.JSON;

/**
 * JDKObserver类
 *
 * @author wangjixue
 * @date 8/1/21 10:10 PM
 */
public class JDKObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        JDKObserveable jdkObserveable = (JDKObserveable) o;
        System.out.println(JSON.toJSONString(jdkObserveable));
        Event event = (Event) arg;
        System.err.println("观察者获取到的事件名称是："+event.getEventName()+"；事件类型是："+event.getEventType());
    }
}
