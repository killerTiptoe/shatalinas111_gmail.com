package org.example.homeWork.CodeMuTests;

/**
 * Напишите код, который выведет первые N степеней двойки.
 */
public class Test27 {
	public static void main(String[] args) {
		int N = 10; // количество степеней
		for (int i = 0; i < N; i++) {
			//System.out.println("2 в степени " + i + " = " + Math.pow(2, i));
			System.out.printf("2 в степени " + i + " = %.0f\n", Math.pow(2, i)); // для вывода на экран целого значения используем...
		}

	}
}
