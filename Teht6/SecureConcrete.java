package Teht6;

public class SecureConcrete extends SecureObject {

    public SecureConcrete(Databox data) {
        super(data);
    }

    @Override
    public void act() {
        System.out.print("Give password:\n");
        if (this.verify(super.data.lukija.nextLine())) {
            System.out.println(super.data.giveSecret());
        } else {
            System.out.println("Wrong password");
        }
    }

   
}
