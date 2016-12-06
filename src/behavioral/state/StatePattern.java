package behavioral.state;

/**
 * Created by oleksij.onysymchuk@gmail on 26.11.2016.
 */
public class StatePattern {

    public static void main(String[] args) {
        Door door = new Door();
        System.out.println("> Trying to close door.");
        door.close();
        System.out.println("> Trying to close door again.");
        door.close();
        System.out.println("> Trying to open door.");
        door.open();
        System.out.println("> Trying to set door in middle position.");
        door.toMiddlePosition();
        System.out.println("> Trying to set door in middle position again.");
        door.toMiddlePosition();
    }

    interface DoorState {
        void close();
        void open();
        void toMiddlePosition();
    }

    static class Door {
        private DoorState opened;
        private DoorState closed;
        private DoorState middlePosition;

        private DoorState actualState;

        Door() {
            opened = new DoorOpened(this);
            closed = new DoorClosed(this);
            middlePosition = new DoorInMiddlePosition(this);
            actualState = middlePosition;
            System.out.println("The door is IN MIDDLE POSITION now...");
        }

        void setActualState(DoorState actualState) {
            this.actualState = actualState;
        }


        void close() {
            actualState.close();
        }

        void open() {
            actualState.open();
        }

        void toMiddlePosition() {
            actualState.toMiddlePosition();
        }

        DoorState getOpened() {
            return opened;
        }

        DoorState getClosed() {
            return closed;
        }

        DoorState getMiddlePosition() {
            return middlePosition;
        }

        public DoorState getActualState() {
            return actualState;
        }
    }

    static class DoorOpened implements DoorState {
        Door door;

        DoorOpened(Door door) {
            this.door = door;
        }

        @Override
        public void close() {
            door.setActualState(door.getClosed());
            System.out.println("The door is CLOSED now...");

        }

        @Override
        public void toMiddlePosition() {
            door.setActualState(door.getMiddlePosition());
            System.out.println("The door is IN MIDDLE POSITION now...");
        }


        @Override
        public void open() {
            System.out.println("Sorry, the door is already OPENED! ");
        }
    }

    static class DoorClosed implements DoorState {
        Door door;

        DoorClosed(Door door) {
            this.door = door;
        }

        @Override
        public void close() {
            System.out.println("Sorry, the door is already CLOSED! ");

        }

        @Override
        public void toMiddlePosition() {
            door.setActualState(door.getMiddlePosition());
            System.out.println("The door is IN MIDDLE POSITION now...");
        }


        @Override
        public void open() {
            door.setActualState(door.getOpened());
            System.out.println("The door is OPENED now...");
        }
    }

    static class DoorInMiddlePosition implements DoorState {
        Door door;

        DoorInMiddlePosition(Door door) {
            this.door = door;
        }

        @Override
        public void close() {
            door.setActualState(door.getClosed());
            System.out.println("The door is CLOSED now...");
        }

        @Override
        public void toMiddlePosition() {
            System.out.println("Sorry, the door is already IN MIDDLE POSITION! ");

        }

        @Override
        public void open() {
            door.setActualState(door.getOpened());
            System.out.println("The door is OPENED now...");
        }
    }

}
