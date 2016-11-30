package behavioral.observer;

/**
 * Created by user on 05.11.2014.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexObserver(subject);
        new OctalObserver(subject);

        System.out.println("First state change:");
        subject.setState(15);
        System.out.println("Second state change:");
        subject.setState(10);

        subject.setState(10678);
        subject.setState(-93475);
        subject.setState(6572);
        subject.setState(-98515);
        subject.setState(3094857);
        subject.setState(-904);
    }
}
