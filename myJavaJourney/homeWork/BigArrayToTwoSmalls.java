package org.example.homeWork.Lesson18;
/*
 * Создать один большой массив на 10 значений и два маленьких на 5 значений.
 * Ввести в него значения с клавиатуры.
 * Скопировать большой массив в два маленьких: половину элементов большого массива в первый маленький массив, вторую - во второй маленький массив.
 * Вывести второй маленький массив на экран.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BigArrayToTwoSmalls {
	public static void main(String[] args) throws IOException {
		int arrayBig[] = new int[10];
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < arrayBig.length; i++) {
			arrayBig[i] = Integer.parseInt(console.readLine());
		}
		int arraySmall1[] = new int[10];
		int arraySmall2[] = new int[10];

		arraySmall1 = Arrays.copyOfRange(arrayBig, 0, 4);
		arraySmall2 = Arrays.copyOfRange(arrayBig, 5, 10);

		for (int i = 0; i < arraySmall2.length; i++) {
			System.out.print(arraySmall2[i] + " ");
		}
		System.out.println(Arrays.toString(arraySmall2));
	}
}
