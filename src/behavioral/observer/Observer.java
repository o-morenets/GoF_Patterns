package behavioral.observer;

/**
 * Created by user on 05.11.2014.
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
