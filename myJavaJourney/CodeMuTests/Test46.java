package org.example.homeWork.CodeMuTests;
/**
 * Дано некоторое целое число:
 * Найдите факториал этого числа.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test46 {
	public static long getFactorial(int f) {
		long result = 1;
		for (int i = 1; i <= f; i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(getFactorial(Integer.parseInt(console.readLine())));
	}
}
