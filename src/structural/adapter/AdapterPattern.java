package structural.adapter;

/**
 * Created by oleksij.onysymchuk@gmail on 25.11.2016.
 */
public class AdapterPattern {

    public static void main(String[] args) {
        //do something slowly
        new Client(new FrameworkImpl()).doSomething();

        //do something faster
        new Client(new FrameworkAdapter(new FinalFrameworkWithNonConvinientInterface())).doSomething();
    }

    static class Client {
        private Framework framework;

        public Client(Framework framework) {
            this.framework = framework;
        }

        void doSomething() {
            framework.doSomethingImportantA();
            framework.doSomethingImportantB();
        }
    }

    static class FrameworkAdapter implements Framework {
        private FastFrameworkWithNonConvenientInterface fastFramework;

        public FrameworkAdapter(FastFrameworkWithNonConvenientInterface fastFramework) {
            this.fastFramework = fastFramework;
        }

        @Override
        public void doSomethingImportantA() {
            fastFramework.doFast1();
            fastFramework.doFast3();
        }

        @Override
        public void doSomethingImportantB() {
            fastFramework.doFast4();
        }
    }

    interface Framework {
        void doSomethingImportantA();

        void doSomethingImportantB();
    }

    static class FrameworkImpl implements Framework {
        @Override
        public void doSomethingImportantA() {
            System.out.println("Doing something important AAA, but very slow");
        }

        @Override
        public void doSomethingImportantB() {
            System.out.println("Doing something important BBB, but also very slow");
        }
    }

    interface FastFrameworkWithNonConvenientInterface {
        void doFast1();             // 1+3 = doSomething

        void doFast2();

        void doFast3();

        void doFast4();             // 4 = doSomethingB
    }

    static class FinalFrameworkWithNonConvinientInterface implements FastFrameworkWithNonConvenientInterface {
        @Override
        public void doFast1() {
        }

        @Override
        public void doFast2() {
        }

        @Override
        public void doFast3() {
        }

        @Override
        public void doFast4() {
        }
    }
}
