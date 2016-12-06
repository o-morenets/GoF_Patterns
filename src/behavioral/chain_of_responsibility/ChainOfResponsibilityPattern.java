package behavioral.chain_of_responsibility;

/**
 * Created by oleksij.onysymchuk@gmail on 26.11.2016.
 */
public class ChainOfResponsibilityPattern {

    public static void main(String[] args) {

        // constructing test objects
        SomeObject obj1 = new SomeObject(Type.A);
        SomeObject obj2 = new SomeObject(Type.B);
        SomeObject obj3 = new SomeObject(Type.C);

        //constructing chain of responsibility
        Chain chain1 = new HandlerAB();
        Chain chain2 = new HandlerB();
        Chain chain3 = new HandlerA();
        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);

        //running
        System.out.println("Calling on object type.A");
        chain1.doSomething(obj1);
        System.out.println();
        System.out.println("Calling on object type.B");
        chain1.doSomething(obj2);
        System.out.println();
        System.out.println("Calling on object type.C");
        chain1.doSomething(obj3);
    }


    enum Type {A, B, C}

    static class SomeObject {
        private Type type;

        SomeObject(Type type) {
            this.type = type;
        }

        Type getType() {
            return type;
        }

        @Override
        public String toString() {
            return "SomeObject{" +
                    "type=" + type +
                    '}';
        }
    }

    interface Chain {
        void doSomething(SomeObject obj);

        void setNextChain(Chain chain);
    }

    static class HandlerA implements Chain {
        Chain nextChain;

        @Override
        public void doSomething(SomeObject obj) {
            if (obj.getType() == Type.A) {
                System.out.println("HandlerA is doing something with " + obj);
            } else {
                if (nextChain != null) {
                    nextChain.doSomething(obj);
                } else {
                    System.out.println("Chain end has been reached.");
                }
            }
        }

        @Override
        public void setNextChain(Chain chain) {
            nextChain = chain;
        }
    }

    static class HandlerB implements Chain {
        Chain nextChain;

        @Override
        public void doSomething(SomeObject obj) {
            if (obj.getType() == Type.B) {
                System.out.println("HandlerB is doing something with " + obj);
            } else {
                if (nextChain != null) {
                    nextChain.doSomething(obj);
                } else {
                    System.out.println("Chain end has been reached.");
                }
            }
        }

        @Override
        public void setNextChain(Chain chain) {
            nextChain = chain;
        }
    }

    static class HandlerAB implements Chain {
        Chain nextChain;

        @Override
        public void doSomething(SomeObject obj) {
            if (obj.getType() == Type.B || obj.getType() == Type.A) {
                System.out.println("HandlerAB is doing something with " + obj + " and calls next chain");
            }
            if (nextChain != null) {
                nextChain.doSomething(obj);
            } else {
                System.out.println("Chain end has been reached.");
            }

        }

        @Override
        public void setNextChain(Chain chain) {
            nextChain = chain;
        }
    }
}
