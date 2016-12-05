package creational.singleton;

/**
 * Created by user on 04.11.2014.
 */
class Administrator {

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

public class SingletonExample {

    public static void main(String[] args) {
        Administrator.get_instance("Наташа").showName();
        Administrator.get_instance("Вася").showName();
        Administrator.get_instance("Администратор").showName();
    }
}
