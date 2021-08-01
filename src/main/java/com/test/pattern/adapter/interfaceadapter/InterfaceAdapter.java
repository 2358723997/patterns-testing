package com.test.pattern.adapter.interfaceadapter;


import com.test.pattern.adapter.Adaptee;
import com.test.pattern.adapter.InterfaceTarget;

/**
 * Adapter类
 *
 * @author wangjixue
 * @date 8/2/21 12:49 AM
 */
public abstract class InterfaceAdapter implements InterfaceTarget {

    protected Adaptee adaptee;

    public InterfaceAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public int request() {
        System.err.println("InterfaceAdapter");
        return adaptee.specificRequest()/44;
    }

    @Override
    public int request1() {
        return 0;
    }

    @Override
    public int request2() {
        return 0;
    }

    @Override
    public int request3() {
        return 0;
    }

    @Override
    public int request4() {
        return 0;
    }

}
