package org.example.Lesson18;

// создайте метод, в инпуте параметра которого содержится массив
// выведите на экран используя метод в действии минимальный и максимальный элементы
public class TestF {
	public static void minMax2(int[] array) {
		int max = array[0];
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}

class TestFTest {
	public static void main(String[] args) {
		TestF.minMax2(new int[]{2, -9, 0, 10, 1});
	}
}