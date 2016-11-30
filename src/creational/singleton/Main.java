package creational.singleton;

/**
 * Created by user on 04.11.2014.
 */
public class Main {
    public static void main(String[] args) {
        Administrator.get_instance("Наташа").showName();
        Administrator.get_instance("Вася").showName();
        Administrator.get_instance("Администратор").showName();
    }
}
