package com.test.pattern.adapter;

import com.test.pattern.adapter.classadapter.ClassAdapter;
import com.test.pattern.adapter.interfaceadapter.InterfaceAdapter;
import com.test.pattern.adapter.objectadapter.ObjectAdapter;

/**
 * AdapterTest类
 *
 * @author wangjixue
 * @date 8/2/21 12:50 AM
 */
public class AdapterTest {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new ClassAdapter();
        System.err.println(target.request());
        target = new ObjectAdapter(adaptee);
        System.err.println(target.request());
        InterfaceTarget interfaceTarget = new InterfaceAdapter(new Adaptee()){
            @Override
            public int request1() {
                return adaptee.specificRequest() / 10;
            }
        };
        System.err.println(interfaceTarget.request());
    }
}
