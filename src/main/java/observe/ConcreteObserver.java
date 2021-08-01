package observe;

/**
 * ConcreteObserver类
 *
 * @author wangjixue
 * @date 8/1/21 9:55 PM
 */
public class ConcreteObserver<T> implements IObserver<T>{
    @Override
    public void update(T event) {

        System.err.println(event);
    }
}
