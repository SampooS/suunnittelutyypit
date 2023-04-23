import java.util.Collection;

public class test {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        ListIterator iterator = new ListIterator(list);

        IteratorThread thread1 = new IteratorThread(iterator);
        IteratorThread thread2 = new IteratorThread(iterator);

        // thread1.start();
        // thread2.start();

        iterator.next();

        System.out.println("Main thread finished.");
        iterator.forEachRemaining(System.out::println);
    }
}
