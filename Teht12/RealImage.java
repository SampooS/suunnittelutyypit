package Teht12;

public class RealImage implements Image {

    private final String filepath;
    String name;

    public RealImage(String filepath, String name) {
        this.filepath = filepath;
        this.name = name;
        readFromDisk();
    }

    @Override
    public String showData() {
        return this.name;
    }

    public void readFromDisk() {
        System.out.println("Loading image: " + filepath);
    }

    public void displayImage() {
        System.out.println("showing: " + filepath);
    }
    
}
