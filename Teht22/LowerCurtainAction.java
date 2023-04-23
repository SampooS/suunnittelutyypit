package Teht22;

public class LowerCurtainAction implements Command {
    private Curtain curtain;

    public LowerCurtainAction(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        curtain.lower();
    }
}
