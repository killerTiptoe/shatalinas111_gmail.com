package org.example.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exchanger {
	public static void main(String[] args) throws IOException {
		double exchangeRateUSD = 94.8;
		double exchangeRateEUR = 103.8;
		double exchangeRateCNY = 13.1;

		double interestRateRUB = 7;
		double interestRateUSD = 1;
		double interestRateEUR = 0.8;
		double interestRateCNY = 1.5;


		System.out.println("Введите номер валюты:");
		System.out.println("1 – рубли;");
		System.out.println("2 – доллары;");
		System.out.println("3 – евро;");
		System.out.println("4 – юани.");

		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int currency = Integer.parseInt(console.readLine());

		double exchangeRate = 1;
		double interestRate;
		String currencySymbol;

		if (currency == 1) {
			interestRate = interestRateRUB;
			currencySymbol = "RUB";
		} else if (currency == 2) {
			exchangeRate = exchangeRateUSD;
			interestRate = interestRateUSD;
			currencySymbol = "USD";
		} else if (currency == 3) {
			exchangeRate = exchangeRateEUR;
			interestRate = interestRateEUR;
			currencySymbol = "EUR";
		} else if (currency == 4) {
			exchangeRate = exchangeRateCNY;
			interestRate = interestRateCNY;
			currencySymbol = "CNY";
		} else {
			System.out.println("Ошибка: выбрана некорректная валюта. Валюта по умолчанию — рубли.");
			currency = 1; // устанавливаем валюту по умолчанию — рубли
			interestRate = interestRateRUB;
			currencySymbol = "RUB";
		}

		System.out.println("Введите начальную сумму в выбранной валюте:");
		BufferedReader console1 = new BufferedReader(new InputStreamReader(System.in));
		double amount = Double.parseDouble(console1.readLine());


		System.out.println("Введите количество лет для расчёта:");
		BufferedReader console2 = new BufferedReader(new InputStreamReader(System.in));
		int years = Integer.parseInt(console2.readLine());


		for (int i = 1; i <= years; i++) {
			amount = amount + amount * (interestRate / 100);

			// добавьте условие, при котором каждые три года сумма также увеличивается на 1%
			if (i % 3 == 0) {
				// формула для изменения на 1%
				amount = (amount + amount * 1 / 100);
			}
		}

		System.out.println("К окончанию срока сумма составит: " + amount + " " + currencySymbol);

		// если валюта – не рубли
		if (currency != 1) {
			double roubles = amount * exchangeRate;
			System.out.println("В рублях это будет: " + roubles + " руб.");
		}

		System.out.println("Good LUCK");
	}
}
