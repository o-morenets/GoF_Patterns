package behavioral.momento;

import java.util.ArrayList;
import java.util.List;

/**
 * Momento pattern example
 * Created by a-morenets (alexey.morenets@gmail.com) on 09.12.2016.
 */

class Originator {

    private String state;
    // The class could also contain additional data that is not part of the
    // state saved in the memento..

    void set(String state) {
        System.out.println("Originator: Setting state to " + state);
        this.state = state;
    }

    Memento saveToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(this.state);
    }

    void restoreFromMemento(Memento memento) {
        this.state = memento.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }

    static class Memento {
        private final String state;

        Memento(String stateToSave) {
            state = stateToSave;
        }

        private String getSavedState() {
            return state;
        }
    }
}

class Caretaker {

    public static void main(String[] args) {
        List<Originator.Memento> savedStates = new ArrayList<>();

        Originator originator = new Originator();
        originator.set("State1");
        originator.set("State2");
        savedStates.add(originator.saveToMemento());
        originator.set("State3");

        // We can request multiple mementos, and choose which one to roll back to.
        savedStates.add(originator.saveToMemento());
        originator.set("State4");

        originator.restoreFromMemento(savedStates.get(1));
    }

}