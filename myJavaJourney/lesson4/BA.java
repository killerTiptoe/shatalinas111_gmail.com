package org.example.lesson4;

public class BA {
	int id = 1;
	String name = "Ivan";
	double balance = 150.00;

	void popolneniecheta(double popolnenie) {
		System.out.println(id + "," + name);
		System.out.println("Balance: " + balance + "$");
		System.out.println("Balance popolnen na " + popolnenie + "$");
		balance += popolnenie;
		System.out.println("Vash balance pocle popolnenia: " + balance + "$");
		System.out.println("----------------------------------");
	}

	void spisaniesoscheta(double spisanie) {
		System.out.println(id + "," + name);
		System.out.println("Balance: " + balance + "$");
		System.out.println("Spisanie co cheta " + spisanie + "$");
		balance -= spisanie;
		System.out.println("Vash balance pocle spisnia co cheta: " + balance + "$");
		System.out.println("----------------------------------");
	}
}

class BAtest {
	public static void main(String[] args) {
		BA MyAcc = new BA();
		MyAcc.popolneniecheta(250.50);
		MyAcc.spisaniesoscheta(345.50);
	}
}
