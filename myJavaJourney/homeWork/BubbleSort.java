package org.example.homeWork.Lesson18;
/**
 * sort by "bubble"
 */

import java.util.Arrays;

public class BubbleSort {
	public static void sortirovka(int[] array) {
		boolean isSorted = false;

		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int swap = array[i];
					array[i] = array[i + 1];
					array[i + 1] = swap;
					isSorted = false;
				}
			}
			System.out.println(Arrays.toString(array));
		}
	}

	public static void main(String[] args) {
		sortirovka(new int[]{3, 0, -2, -10, 22, -4, 1, 20});
	}
}

