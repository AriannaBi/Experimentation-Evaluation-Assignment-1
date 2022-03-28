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
		Integer[][] allInteger = { a, b, c, d, e, f};
		String[][] allString = {g, h, i, j, k, l };
		float[] timeA1 = new float[12];
		float[] timeA2 = new float[12];
		float[] timeA3 = new float[12];

		testWhileNeeded(allInteger, allString, timeA1);
		testUntilNoChange(allInteger, allString, timeA2);
		testPassPerItem(allInteger, allString, timeA3);

		System.out.println("A1--------");
		for (float m : timeA1) {
			System.out.println(m);
		}
		System.out.println("A2--------");
		for (float m : timeA2) {
			System.out.println(m);
		}
		System.out.println("A3--------");
		for (float m : timeA3) {
			System.out.println(m);
		}

		// 500 iterations
		// Warm up 1 cycle

	}

	public static void testWhileNeeded(Integer[][] allInteger, String[][] allString, float[] timeA1) {
		int j = 0;
		// ----Warm up
		whileNeeded.sort(allInteger[0]);
		// -----
		for (Integer[] o : allInteger) {
			float sum  = 0;
			for (int i = 0; i < iterations; i++) {
				long start = System.nanoTime();
				whileNeeded.sort(o);
				long end = System.nanoTime();
				long result = end - start;
				sum += result;
			}
			float avg = sum / iterations;
			timeA1[j] = avg;
			j += 1;
		}
		for (String[] o : allString) {
			float sum  = 0;
			for (int i = 0; i < iterations; i++) {
				long start = System.nanoTime();
				whileNeeded.sort(o);
				long end = System.nanoTime();
				long result = end - start;
				sum += result;
			}
			float avg = sum / iterations;
			timeA1[j] = avg;
			j += 1;
		}

		return;
	}

	public static void testUntilNoChange(Integer[][] allInteger, String[][] allString, float[] timeA2) {
		int j = 0;
		// ----Warm up
		untilNoChange.sort(allInteger[0]);
		// -----
		for (Integer[] o : allInteger) {
			float sum  = 0;
			for (int i = 0; i < iterations; i++) {
				long start = System.nanoTime();
				untilNoChange.sort(o);
				long end = System.nanoTime();
				long result = end - start;
				sum += result;
			}
			float avg = sum / iterations;
			timeA2[j] = avg;
			j += 1;
		}
		for (String[] o : allString) {
			float sum  = 0;
			for (int i = 0; i < iterations; i++) {
				long start = System.nanoTime();
				untilNoChange.sort(o);
				long end = System.nanoTime();
				long result = end - start;
				sum += result;
			}
			float avg = sum / iterations;
			timeA2[j] = avg;
			j += 1;
		}
		return;
	}

	public static void testPassPerItem(Integer[][] allInteger, String[][] allString, float[] timeA3) {
		int j = 0;
		// ----Warm up
		passPerItem.sort(allInteger[0]);
		// -----
		for (Integer[] o : allInteger) {
			float sum  = 0;
			for (int i = 0; i < iterations; i++) {
				long start = System.nanoTime();
				passPerItem.sort(o);
				long end = System.nanoTime();
				long result = end - start;
				sum += result;
			}
			float avg = sum / iterations;
			timeA3[j] = avg;
			j += 1;
		}
		for (String[] o : allString) {
			float sum  = 0;
			for (int i = 0; i < iterations; i++) {
				long start = System.nanoTime();
				passPerItem.sort(o);
				long end = System.nanoTime();
				long result = end - start;
				sum += result;
			}
			float avg = sum / iterations;
			timeA3[j] = avg;
			j += 1;
		}
		return;
	}

}
