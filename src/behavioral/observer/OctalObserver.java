package behavioral.observer;

/**
 * Created by user on 05.11.2014.
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal string: " + Integer.toOctalString(subject.getState()));
    }
}
