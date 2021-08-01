package com.test.pattern.decorator;

/**
 * DecoratorTest类
 *
 * @author wangjixue
 * @date 8/1/21 3:06 PM
 */
public class DecoratorTest {

    public static void main(String[] args) {
        BatterCake cake;
        cake = new BaseBatterCake();
        System.out.println(cake.getMsg() + ",总价" + cake.getPrice());
        cake = new EggWrapper(cake);
        cake = new EggWrapper(cake);
        cake = new SausageWrapper(cake);
        System.out.println(cake.getMsg() + ",总价" + cake.getPrice());

    }
}
