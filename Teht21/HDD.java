import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HDD {
    String data = "";

    public HDD() {
        try {
            load();
            System.out.println("Loaded disk data");

        } catch (Exception e) {
            System.out.println("Failed to load disk data");
            e.printStackTrace();
        }

    }

    String read(long location, int length) {
        System.out.println("HDD read " + length + " bytes from " + location);
        return data.substring((int) location, (int) location + length);
    }

    void load() throws IOException {
        data = Files.readString(Path.of("Teht21\\diskImg.txt"));
    }

}
