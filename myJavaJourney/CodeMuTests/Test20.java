package org.example.homeWork.CodeMuTests;

/**
 * Даны два целых числа. Проверьте, что первое число без остатка делится на второе.
 */
public class Test20 {
	public static void isEmpty(int number1, int number2) {
		boolean bar = true;
		int result = number1 % number2;
		if (result == 0) {
			System.out.println(result + ", " + (bar));
		} else {
			System.out.println(result + ", " + (!bar));
		}
	}

	public static void main(String[] args) {
		isEmpty(122, 3);
	}
}

