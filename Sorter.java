import java.util.*;

interface Sorter<T extends Comparable<T>> {

	void sort(T[] items);
	
	public static void main(String[] args) {
		BubbleSortWhileNeeded bs = new BubbleSortWhileNeeded();
		Integer[] arr = new Integer[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 4;
		}
		System.out.println(arr);
		bs.sort(arr);
		System.out.println(arr);

	}

}
