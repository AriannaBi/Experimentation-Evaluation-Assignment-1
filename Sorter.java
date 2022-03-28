import java.util.*;
import DataFile.DataFile;

interface Sorter<T extends Comparable<T>> {

	void sort(T[] items);

	int iterations = 500;
	BubbleSortWhileNeeded whileNeeded = new BubbleSortWhileNeeded();
	BubbleSortUntilNoChange untilNoChange = new BubbleSortUntilNoChange();
	BubbleSortPassPerItem passPerItem = new BubbleSortPassPerItem();

	public static void main(String[] args) {
		Integer[] a = DataFile.A;
		Integer[] b = DataFile.B;
		Integer[] c = DataFile.C;
		Integer[] d = DataFile.D;
		Integer[] e = DataFile.E;
		Integer[] f = DataFile.F;
		String[] g = DataFile.G;
		String[] h = DataFile.H;
		String[] i = DataFile.I;
		String[] j = DataFile.J;
		String[] k = DataFile.K;
		String[] l = DataFile.L;
		Object[] all = { a, b, c, d, e, f, g, h, i, j, k, l };
		float[] timeA1 = new float[12];
		float[] timeA2 = new float[12];
		float[] timeA3 = new float[12];

		// 500 iterations
		// Warm up 1 cycle

	}

	public static void testWhileNeeded(Object[][] all, float[] timeA1) {
		for (Object o : all) {
			// warm up
			for (int i = 0; i < iterations; i++) {
				long start = System.nanoTime();
				whileNeeded.sort(o);
				long end = System.nanoTime();
				long result = end - start;

			}
		}

		return;
	}

	public static void testUntilNoChange(float[] timeA2) {
		long start = System.nanoTime();

		long end = System.nanoTime();
		long result = end - start;
		return;
	}

	public static void testPassPerItem(float[] timeA3) {
		long start = System.nanoTime();

		long end = System.nanoTime();
		long result = end - start;
		return;
	}

}
