package org.example.homeWork.CodeMuTests;

import javax.crypto.spec.PSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Найдите сумму первой и последней цифры введенного числа.
 */
public class Test50 {
	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(console.readLine());
		// попытка сделать через простой алгоритм
		if (q < 0) {
			q = -q;
		}
		int last = q % 10; // здесь находим последнюю цифру путем остатка от деления на 10

		while (q > 9) {   // здесь делить нужно число на 10, пока не доберемся до первой цифры первого десятка
			q = q / 10;
		}
		System.out.println("последняя цифра введенного числа = \t" + last);
		System.out.println("первая цифра введенного числа = \t" + q);
		System.out.println("сумма цифр = " + (last + q));
	}
}
