package org.example.homeWork.Lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lottery2 {
	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int number = 0;
		int winNumber = 50;

		while (number != winNumber) {
			System.out.println("Enter the number above '0' and below '100' : ");
			number = Integer.parseInt(console.readLine());

			if (number < winNumber && number >= 0 && number <= 100) {
				System.out.println("enter the number more then... and try again!");
				System.out.println("===========================================");
			} else if (number > winNumber && number >= 0 && number <= 100) {
				System.out.println("enter the number less then... and try again!");
				System.out.println("===========================================");
			} else {
				System.out.println("you enter the incorrect value!!! See the condition!! ");
				System.out.println("=====================================================");
			}
		}
		System.out.println("You win!!! You enter '50'");
	}
}
