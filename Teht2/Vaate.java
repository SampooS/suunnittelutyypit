package Teht2;

public class Vaate implements AbstraktiVaate {

    private String Brandi;
    private int sarjanumero;

    public Vaate(String name, int num) {
        this.Brandi = name;
        this.sarjanumero = num;
    }
    @Override

    public String toString(){
        return "Tämä vaate on " + Brandi;
    } 
    
}
