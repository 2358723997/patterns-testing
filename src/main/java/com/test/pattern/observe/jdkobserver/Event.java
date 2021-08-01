package com.test.pattern.observe.jdkobserver;

import lombok.Data;

/**
 * Event类
 *
 * @author wangjixue
 * @date 8/1/21 10:10 PM
 */
@Data
public class Event {
    private String eventName;
    private String eventType;

    public Event(String eventName, String eventType) {
        this.eventName = eventName;
        this.eventType = eventType;
    }
}
