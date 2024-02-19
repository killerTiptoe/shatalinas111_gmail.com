package org.example.homeWork.CodeMuTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Дана некоторая строка:
 * Переберите и выведите в консоль по очереди все символы с конца строки.
 */
public class Test32 {
	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String str1 = console.readLine();
		int start = 0;
		int end = str1.length();
		char[] text = new char[end - start];
		str1.getChars(start, end, text, 0);
		for (int i = text.length - 1; i > -1; i--) {
			System.out.print(text[i] + " ");
		}
	}
}
