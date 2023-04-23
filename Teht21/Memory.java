import java.util.HashMap;

public class Memory {

    HashMap<Long, String> data = new HashMap<Long, String>();

    void load(long position, String data) {
        System.out.println("RAM load " + data + " to " + position);
        this.data.put(position, data);
    }

    String read(long position) {
        System.out.println("RAM read " + data.get(position) + " from " + position);
        return data.get(position);
    }
}
