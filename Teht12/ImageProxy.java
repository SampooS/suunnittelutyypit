package Teht12;

public class ImageProxy implements Image {

    public String name;
    private final String filepath;
    private RealImage image;

    public ImageProxy(String filepath, String nimi) {
        this.name = nimi;
        this.filepath = filepath;
    }
    
    public void displayImage() {
        if (image == null) {
            this.image = new RealImage(this.filepath, this.name);
        }
        image.displayImage();
    }

    @Override
    public String showData() {
        return this.name;
    }

    
}
