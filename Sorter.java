import java.util.*;
import DataFile.DataFile;

interface Sorter<T extends Comparable<T>> {

	void sort(T[] items);
	
	public static void main(String[] args) {
		BubbleSortWhileNeeded bs = new BubbleSortWhileNeeded();
		Integer[] a = DataFile.A;
		Integer[] b = DataFile.B;
		Integer[] c = DataFile.C;
		Integer[] D = DataFile.D;
		Integer[] e = DataFile.E;
		Integer[] f = DataFile.F;
		String[] g = DataFile.G;
		String[] h = DataFile.H;
		String[] i = DataFile.I;
		String[] j = DataFile.J;
		String[] k = DataFile.K;
		String[] l = DataFile.L;
	}

}
