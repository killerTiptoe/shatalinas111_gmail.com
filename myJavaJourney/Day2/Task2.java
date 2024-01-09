package org.example.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите два числа: ");  // диапазон проверяемых чисел
		int a = Integer.parseInt(console.readLine());
		int b = Integer.parseInt(console.readLine());

		for (int i = a + 1; i < b; i++) {
			if (i % 5 == 0 && i % 10 != 0) {
				System.out.print(i + " ");
			}
		}
		if (a >= b) {
			System.out.println("некорректный ввод");
		}
	}
}

