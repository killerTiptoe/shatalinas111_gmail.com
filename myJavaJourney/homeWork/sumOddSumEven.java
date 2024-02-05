package org.example.homeWork.Lesson18;
/*
 * Создать массив на 15 целых чисел.
 * Ввести в него значения с клавиатуры.
 * Пускай индекс элемента массива является номером дома, а значение — числом жителей, проживающих в доме.
 * Дома с нечетными номерами расположены на одной стороне улицы, с четными — на другой. Выяснить, на какой стороне улицы проживает больше жителей.
 * Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."
 * Примечание: дом с порядковым номером 0 считать четным.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumOddSumEven {
	public static void main(String[] args) throws IOException {
		int array[] = new int[8];
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		int summOdd = 0;
		int summEven = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(console.readLine());
		}

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				summEven += array[i];
			} else {
				summOdd += array[i];
			}
		}
		if (summEven > summOdd) {
			System.out.println("В домах с четными номерами проживает больше жителей.");
		} else if (summEven < summOdd) {
			System.out.println("В домах с нечетными номерами проживает больше жителей.");
		}
	}
}

