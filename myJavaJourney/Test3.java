package org.example.homeWork;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите 1 число:\t");
		float a1 = Integer.parseInt(console.readLine());
		System.out.println("Введите 2 число:\t");
		float a2 = Integer.parseInt(console.readLine());
		System.out.println("Какую операцию вы хотите исполнить:\t 1.Сложение \t2.Вычитание \t3.Умножение \t4.Деление");
		int action = Integer.parseInt(console.readLine());
		switch (action) {
			case 1:
				System.out.println("Операция сложения чисел:\t" + (a1 + a2));
				break;
			case 2:
				System.out.println("Операция вычитания чисел:\t" + (a1 - a2));
				break;
			case 3:
				System.out.println("Операция умножения чисел:\t" + (int) (a1 * a2));
				break;
			case 4:
				if (a2 == 0) {
					System.out.println("ERROR");
				} else {
					System.out.printf("Операция деления чисел:\t %.3f", (a1 / a2));
				}
				break;
			default:
				System.out.println("Операция не определена");
		}
	}
}
