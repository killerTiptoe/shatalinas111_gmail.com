package org.example.homeWork.CodeMuTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Дано некоторое целое число:
 * Найдите сумму всех его четных цифр.
 */
public class Test44 {
	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String str = console.readLine();

		int start = 0;
		int end = str.length();
		char[] array = new char[end - start];
		str.getChars(start, end, array, 0);

		int summa = 0;
		int value;
		for (int i = 0; i < array.length; i++) {
			value = array[i] - '0';
			if (value % 2 == 0) {
				System.out.println("четная цифра введенного числа - " + value);
				summa += value;
			}
		}
		System.out.println("сумма четных цифр введенного числа = " + summa);
	}
}
