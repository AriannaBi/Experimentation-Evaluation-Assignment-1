import java.util.*;
interface Sorter<T extends Comparable<T>> {

	void sort(T[] items);

	public static void main(String[] args) {
        BubbleSortWhileNeeded bs = new BubbleSortWhileNeeded();
        final ArrayList<T> T = new ArrayList<T>();
        bs.sort();

        
    }

}
