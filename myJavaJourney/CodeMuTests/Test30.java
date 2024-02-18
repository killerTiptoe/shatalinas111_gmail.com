package org.example.homeWork.CodeMuTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Дано некоторое число:
 * Найдите сумму цифр этого числа.
 */
public class Test30 {
	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String str1 = console.readLine();
		int start = 0;
		int end = str1.length();
		char[] arrayChars = new char[end - start];
		str1.getChars(start, end, arrayChars, 0); // воспользовались методом hetChars, чтобы вывести полученное число в массив чисел
		//System.out.println(arrayChars); // вывели массив чаров
		//System.out.println("========");

		int summaChisel = 0;
		for (int i = 0; i < arrayChars.length; i++) { //использовали массив чаров
			int value = arrayChars[i]-'0';				// значение каждого чара перевел в число

			summaChisel +=value;						// суммируем значения
		}
		System.out.println(summaChisel);
	}
}
