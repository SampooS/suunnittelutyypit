package Teht6;

public abstract class SecureObject implements Item {

    protected Databox data;

    public SecureObject(Databox info) {
        this.data = info;
    }

    public boolean verify(String password) {
        return password.equals("salasana");
    }
}
