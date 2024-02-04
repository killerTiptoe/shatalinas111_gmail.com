package org.example.Lesson18;
// создайте метод, в инпуте параметра которого содержится массив
// выведите на экран используя метод в действии минимальный и максимальный элементы

import java.util.Arrays;

public class TestE {
	public static void minMax(int array1[]) {
		int max = 0; // index of max value
		int min = 0; // index of min value

		Arrays.sort(array1);
		for (int i = 0; i < array1.length; i++) {
			min = array1[0];
			max = array1[array1.length - 1];
		}
		System.out.println(min);
		System.out.println(max);
	}
}

class TestETest {
	public static void main(String[] args) {
		TestE.minMax(new int[]{3, 3, 20, 1, 0, -10});
		System.out.println();
		TestE.minMax(new int[]{20, 0, -9, -19, 0, 2});

	}
}

