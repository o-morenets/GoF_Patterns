package structural.facade;

/**
 * Facade pattern example
 * Created by a-morenets (alexey.morenets@gmail.com) on 05.12.2016.
 */
/* Complex parts */

class CPU {
    void freeze() {
    }

    void jump(long position) {
    }

    void execute() {
    }
}

class Memory {
    void load(long position, byte[] data) {
    }
}

class HardDrive {
    byte[] read(long lba, int size) {
        return new byte[0];
    }
}

/* Facade */

class Computer {
    private static final long BOOT_ADDRESS = 123L;
    private static final long BOOT_SECTOR = 456L;
    private static final int SECTOR_SIZE = 32;

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    void startComputer() {
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}

/* Client */

class FacadeExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }
}