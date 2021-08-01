package observe;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteSubject类
 *
 * @author wangjixue
 * @date 8/1/21 9:53 PM
 */
public class ConcreteSubject<T> implements ISubject<T>{

    private List<IObserver<T>> list = new ArrayList<>();

    @Override
    public boolean attach(IObserver<T> observer) {
        return !this.list.contains(observer) && this.list.add(observer);
    }

    @Override
    public boolean detach(IObserver<T> observer) {
        return this.list.remove(observer);
    }

    @Override
    public void notify(T event) {
        for (IObserver<T> observer : this.list) {
            observer.update(event);
        }
    }
}
