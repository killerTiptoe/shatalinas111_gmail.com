package org.example.homeWork.Lesson18;
/**
 * Создать массив на n- строк.
 * Создать массив на n- чисел.
 * Ввести с клавиатуры n- строк, заполнить ими массив строк.
 * В каждую ячейку массива чисел записать длину строки из массива строк,
 * индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 * Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringLengthToIntValueArray {
	public static void main(String[] args) throws IOException {
		String arrayS[] = new String[2];
		int arrayI[] = new int[2];
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < arrayS.length; i++) {
			arrayS[i] = console.readLine();
		}
		for (int i = 0; i < arrayI.length; i++) {
			arrayI[i] = arrayS[i].length();
		}
		System.out.println(Arrays.toString(arrayI));
	}
}
