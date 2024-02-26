package org.example.homeWork.CodeMuTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Найдите сумму первой и последней цифры любого введенного числа.
 */
public class Test50_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		char[] array = console.readLine().toCharArray();
		int summa;
		int foo = 0;
		if (array[0] == '-') {
			foo = 1;
		}
		summa = array[foo] - '0' + array[array.length - 1] - '0'; // сумма первой и последней цифры числа
		System.out.println("первая цифра введенного числа = " + (array[foo] - '0'));
		System.out.println("последняя цифра введенного числа = " + (array[array.length - 1] - '0'));
		System.out.println("сумма первой и последней цифр числа = " + summa);
	}
}
