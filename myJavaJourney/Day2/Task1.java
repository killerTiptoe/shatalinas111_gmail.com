package org.example.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Введите кол-во этажей дома: ");
		int i = Integer.parseInt(console.readLine());

		if (i >= 1 && i <= 4) {
			System.out.println("кол-во этажей " + i + " соответствует 'малоэтажному' дому");
		} else if (i >= 5 && i <= 8) {
			System.out.println("кол-во этажей " + i + " соответствует 'средне-этажному' дому");
		} else if (i >= 9) {
			System.out.println("кол-во этажей " + i + " соответствует 'многоэтажном' дому");
		} else {
			System.out.println("Вы что-то не то ввели...");
		}
	}
}
