package headfirst.combining.observer;


/**
 * Created by Administrator on 2017/9/19.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
