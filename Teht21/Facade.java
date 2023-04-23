public class Facade extends Thread {
    HDD disk;
    CPU processor;
    Memory ram;

    public Facade() {
        disk = new HDD();
        processor = new CPU();
        ram = new Memory();
    }

    public void start() {
        processor.freeze();
        ram.load(0, disk.read(0, 1024));
        processor.jump(0);
        processor.execute();
    }
}
