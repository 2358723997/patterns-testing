package observe.jdkobserver;

import java.util.Observable;

/**
 * JDKObserver类
 *
 * @author wangjixue
 * @date 8/1/21 10:08 PM
 */
public class JDKObserveable extends Observable {

    private static volatile JDKObserveable observeable;

    private JDKObserveable() {

    }

    public static JDKObserveable getInstance() {
        if (observeable == null) {
            synchronized (JDKObserveable.class) {
                if(observeable == null){
                    return new JDKObserveable();
                }

            }

        }
        return observeable;
    }

    public void notify(Event event) {
        System.err.println("被观察者");
        setChanged();
        super.notifyObservers(event);
    }

}
