package behavioral.iterator;

/**
 * Iterator pattern example
 * Created by a-morenets (alexey.morenets@gmail.com) on 09.12.2016.
 */

/* Create interfaces */

/**
 * Iterator.java
 */
interface Iterator {
    boolean hasNext();

    Object next();
}

/**
 * Container.java
 */
interface Container {
    Iterator getIterator();
}

/**
 * Create concrete class implementing the Container interface.
 * This class has inner class NameIterator implementing the Iterator interface.
 * NameRepository.java
 */
class NameRepository implements Container {
    private String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}

/**
 * Use the NameRepository to get iterator and print names.
 * IteratorPatternDemo.java
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }

}