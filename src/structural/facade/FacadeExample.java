package structural.facade;

/**
 * Created by a-morenets (alexey.morenets@gmail.com) on 05.12.2016.
 */
/* Complex parts */

class CPU {
    public void freeze() {
    }

    public void jump(long position) {
    }

    public void execute() {
    }
}

class Memory {
    public void load(long position, byte[] data) {
    }
}

class HardDrive {
    public byte[] read(long lba, int size) {
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

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
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