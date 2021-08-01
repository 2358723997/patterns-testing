package com.test.pattern.adapter.classadapter;

import com.test.pattern.adapter.Adaptee;
import com.test.pattern.adapter.Target;

/**
 * Adapter类
 *
 * @author wangjixue
 * @date 8/2/21 12:49 AM
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public int request() {
        System.err.println("ClassAdapter");
        return super.specificRequest()/10;
    }
}
