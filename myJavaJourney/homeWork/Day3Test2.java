package org.example.homeWork.PracticDS;
/**
 * Создать массив int’ов из 5 элементов. Заполнить его значениями, введенными с клавиатуры.
 * Вывести на экран сумму каждого значения с предыдущим.
 * Предыдущим значением для 0-го (нулевого) элемента считать последнее значение массива.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day3Test2 {
	public static void main(String[] args) throws IOException {
		int[] array = new int[5];

		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		int summa;
		int prevIndex;
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(console.readLine());
		}
		System.out.println(Arrays.toString(array)); // выводим на экран массив из введенных чисел
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				prevIndex = array.length - 1;
			} else {
				prevIndex = i-1;
			}
			summa = array[i] + array[prevIndex];
			System.out.println("Сумма значений " + array[i] + " и " + array[prevIndex] + " равна " + summa);
		}
	}
}
