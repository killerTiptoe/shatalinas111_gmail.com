package org.example.homeWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.compare;


public class Test7 {

	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the first: ");
		int a1 = Integer.parseInt(console.readLine());
		System.out.print("Enter the second: ");
		int b1 = Integer.parseInt(console.readLine());

		int result = 0;
		result = (int) Math.pow(a1, b1);

		if (a1 % 2 == 0 || b1 % 3 == 0) {
			if (compare(a1, b1) < 0) {
				System.out.println("a < b");
			} else if (compare(a1, b1) > 0) {
				System.out.println("a > b");
			} else if (compare(b1, a1) == 0) {
				System.out.println("a = b");
			}
		} else {
			System.out.println("число " + a1 + " не кратно двум и число " + b1 + " не кратно трем");
		}
		if (a1 % 2 == 0 && a1 % 3 == 0 && (result > 214748367 || result < -214748368)) {
			System.out.println("результат выражения слишком большой");
		} else {
			System.out.println("'the  first' в степени 'the second' = " + result);
		}
	}
}

