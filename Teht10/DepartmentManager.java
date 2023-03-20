package Teht10;

public class DepartmentManager extends Worker {
    private static double allowable = 5;

    @Override
    public void payRise(double percentage) {
        if (percentage < allowable) {
            System.out.println("Department manager approved pay rise");
        } else {
            super.payRise(percentage);
        }
    }

    
}
