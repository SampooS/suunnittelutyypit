package Teht2;
import java.lang.reflect.*;

public class VaateTehdas implements AbstraktiTehdas{
    String brandi;  
    private int sarjanumero = 0;

    public VaateTehdas(String brand) {
        this.brandi = brand;
    }

    @Override
    public Vaate luoVaate() {
        return new Vaate(this.brandi, sarjanumero++);
    }
}
