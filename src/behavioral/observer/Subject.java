package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 05.11.2014.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer :observers) {
            observer.update();
        }
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }
}
