package Teht14;

public class Test {
    public static void main(String[] args) {
        ReindeerMaster reindeerGuy = new ReindeerMaster();

        CheeseMaster cheeseGuy = new CheeseMaster();

        Cashier tiski = new Cashier(cheeseGuy, reindeerGuy);

        Customer jules = new Customer();
        Customer Vincent = new Customer();

        tiski.orderCheeseBurger();
        tiski.orderReindeerBurger();

        jules.setBurger(cheeseGuy.getBurger());
        Vincent.setBurger(reindeerGuy.getBurger());

        System.out.println(jules.printBurger());
        System.out.println(Vincent.printBurger());
    }
}
