package Teht10;

public class Test {
    public static void main(String[] args) {
        MiddleManager midMan = new MiddleManager();

        DepartmentManager depMan = new DepartmentManager();

        CEO ceo = new CEO();

        midMan.setSuperior(depMan);
        depMan.setSuperior(ceo);

        for (int i = 1; i<10; i++) {
            midMan.payRise(Double.valueOf(i));
        }
    }
}