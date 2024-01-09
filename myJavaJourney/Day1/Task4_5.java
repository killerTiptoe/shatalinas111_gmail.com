package org.example.Day1;

public class Task4_5 {
	public static void main(String[] args) {
		/* int year = 1980;
		while (year <= 2020) {
			System.out.println("Олимпиада " + year + " года");
			year = year + 4;
		}
		*/

		for (int year = 1980; year <= 2020; year += 4) {
			System.out.println("Олимпиада " + year + " года");
		}
	}
}
