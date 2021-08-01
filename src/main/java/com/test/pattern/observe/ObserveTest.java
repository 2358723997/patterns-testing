package com.test.pattern.observe;

/**
 * ObserveTest类
 *
 * @author wangjixue
 * @date 8/1/21 9:45 PM
 */
public class ObserveTest {
    public static void main(String[] args) {
        ISubject<String> subject = new ConcreteSubject<String>();

        IObserver<String> observer = new ConcreteObserver<String>();

        subject.attach(observer);

        subject.notify("Hello World !");
    }
}
