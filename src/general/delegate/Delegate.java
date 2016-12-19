package general.delegate;

/**
 * Created by a-morenets (alexey.morenets@gmail.com) on 16.12.2016.
 */
class A {
    void foo() {
        System.out.println("A: вызван метод foo()");
    }
    void bar() {
        System.out.println("A: вызван метод bar()");
    }
}

class B {
    // Создаём объект, методам которого будет делегироваться поведение.
    A a = new A();

    void foo() {
        a.foo();
    }
    void bar() {
        a.bar();
    }
}

public class Delegate {
    public static void main(String[] args) {
        B b = new B();
        b.foo();
        b.bar();
    }
}