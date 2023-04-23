public class IteratorThread extends Thread {
    ListIterator iterator;

    public IteratorThread(ListIterator iterator) {
        this.iterator = iterator;
    }

    public void run() {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator.reset();
        
        System.out.println("Thread " + this.getName() + " finished.");
    }
}
