package com.test.pattern.observe;

/**
 * ISubject接口
 *
 * @author wangjixue
 * @date 8/1/21 9:44 PM
 */
public interface ISubject<T> {

    boolean attach(IObserver<T> observer);

    boolean detach(IObserver<T> observer);

    void notify(T event);
}
