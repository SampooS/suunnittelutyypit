package Teht10;

public class MiddleManager extends Worker {
    private static double allowable = 2;

    @Override
    public void payRise(double percentage) {
        if (percentage < allowable) {
            System.out.println("Middle manager approved pay rise");
        } else {
            super.payRise(percentage);
        }
    }
}
