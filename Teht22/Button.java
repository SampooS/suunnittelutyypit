package Teht22;

public class Button {
    Command action;
    
    public Button(Command action) {
        this.action = action;
    }

    public void press() {
        action.execute();
    }
}
