package Teht22;

public class LiftCurtainAction implements Command {
    private Curtain curtain;

    public LiftCurtainAction(Curtain curtain) {
        this.curtain = curtain;
    }
    
    @Override
    public void execute() {
        curtain.lift();
    }

}