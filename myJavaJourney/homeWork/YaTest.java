package org.example.homeWork.Yandex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YaTest {

	public static void main(String[] args) throws IOException {

		double rateUSD = 88.8;
		double rateEUR = 99.9;
		double rateCNY = 13.5;

		System.out.println("Введите сумму рублей для конвертации:");

		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int roubles = Integer.parseInt(console.readLine());

		System.out.println("Введите номер валюты, в какую перевести рубли:");
		System.out.println("1 – доллары;");
		System.out.println("2 – евро;");
		System.out.println("3 – юани;");

		BufferedReader console1 = new BufferedReader(new InputStreamReader(System.in));
		int command = Integer.parseInt(console1.readLine());

		if (command == 1) {
			double resultDollars = roubles / rateUSD;
			if (resultDollars < 0) {
				System.out.println("Ошибка:некорректные значения.");
			} else {
				System.out.println("Было введено" + roubles + ",в долларах это" + resultDollars);
			}
		} else if (command == 2) {
			double resultEuro = roubles / rateEUR;
			if (resultEuro < 0) {
				System.out.println("Ошибка:некорректные значения.");
			} else {
				System.out.println("Было введено" + roubles + ",в евро это" + resultEuro);
			}
		} else if (command == 3) {
			double resultCny = roubles / rateCNY;
			if (resultCny < 0) {
				System.out.println("Ошибка:некорректные значения.");
			} else {
				System.out.println("Было введено" + roubles + ",в евро это" + resultCny);
			}
		} else {
			System.out.println("Такой команды нет.");
		}
		System.out.println("Работа с программой завершена.");
	}
}
