package Teht2;


public class Testi {

    

    public static void main(String[] args) {
        System.out.println("Testing:");  
        
        Koodaaja Janne = new Koodaaja();
        
        System.out.println(Janne);

        VaateTehdas Boss = new VaateTehdas("Hugo Boss");

        Janne.reFit(Boss);
        
        System.out.println(Janne);
    }

}