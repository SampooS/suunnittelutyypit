import java.util.Iterator;

public class ListIterator implements Iterator {
    int index;
    int[] nums;

    public ListIterator(int[] list) {
        this.index = 0;
        this.nums = list;
    }

    @Override
    public boolean hasNext() {
        return index < nums.length;
    }

    @Override
    public Object next() {
        return nums[index++];
    }

    public void reset() {
        this.index = 0;
    }
}
