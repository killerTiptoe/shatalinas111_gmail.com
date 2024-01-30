package org.example.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnakeDirection {
	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the shake's direction 'right' or 'left': ");
		String enterDirection = console.readLine();

		String head = "(º..º)"; // голова
		String tail = "~~"; // хвост
		String body = "≈"; // тело
		String direction1 = "right";
		String direction2 = "left";


		if (enterDirection.equalsIgnoreCase(direction1)) {
			System.out.print(tail);
			for (int i = 1; i < 10; i++) {
				System.out.print(body);
			}
			System.out.println(head);
		} else if (enterDirection.equalsIgnoreCase(direction2)) {
			System.out.print(head);
			for (int i = 1; i < 10; i++) {
				System.out.print(body);
			}
			System.out.print(tail);
		} else {
			System.out.print("wrong direction");
		}

	}
}
