package com.test.pattern.adapter.objectadapter;

import java.util.Observer;

import com.test.pattern.adapter.Adaptee;
import com.test.pattern.adapter.Target;

/**
 * Adapter类
 *
 * @author wangjixue
 * @date 8/2/21 12:49 AM
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public int request() {
        System.err.println("ObjectAdapter");
        return this.adaptee.specificRequest()/22;
    }
}
