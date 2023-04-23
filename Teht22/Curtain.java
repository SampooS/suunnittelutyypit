package Teht22;

public class Curtain {
    int height;

    public void lift() {
        if (height < 10) {
            height++;
            System.out.println("The curtain is lifted to "  + height + " meters");
        } else {
            System.out.println("The curtain is already at the top");
        }    
    }

    public void lower() {
        if (height > 0) {
            height--;
            System.out.println("The curtain is lowered to "  + height + " meters");
        } else {
            System.out.println("The curtain is already at the bottom");
        }    
    }
    
}
