package creational.singleton;

/**
 * Created by user on 04.11.2014.
 */
public class Administrator {
    private String name;
    private static Administrator _instance;

    private Administrator(String name) {
        this.name = name;
    }

    public static Administrator get_instance(String name) {
        if (_instance == null) {
            _instance = new Administrator(name);
        }
        return _instance;
    }

    public void showName() {
        System.out.println(name);
    }
}
