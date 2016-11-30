package behavioral.observer;

/**
 * Created by user on 05.11.2014.
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary string: " + Integer.toBinaryString(subject.getState()));
    }
}
