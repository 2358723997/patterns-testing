package com.test.pattern.observe;

/**
 * IObserve接口
 *
 * @author wangjixue
 * @date 8/1/21 9:45 PM
 */
public interface IObserver<T> {

   void update(T event);
}
