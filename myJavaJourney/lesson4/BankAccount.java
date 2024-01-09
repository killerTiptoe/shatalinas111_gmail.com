
package org.example.lesson4;

import org.w3c.dom.ls.LSOutput;

public class BankAccount {

	int id;
	String name;
	double balance;
	double popolnenie;
	double spisanie;

	double popolenieCheta(double var1) {
		popolnenie += var1;
		return popolnenie;
	}

	double snyatieSoCheta(double var2) {
		spisanie += var2;
		return spisanie;
	}

	void showInfo() {
		System.out.println(name+"!");
		System.out.println("Vash chet popolnen na: " + popolnenie + "$");
		System.out.println("Spisanie s Vashego cheta: " + spisanie + "$");
		System.out.println("------------------------------");
	}
}


class BankAccountTest {

	public static void main(String[] args) {
		BankAccount MyAcc = new BankAccount();
		BankAccount YourAcc = new BankAccount();
		BankAccount HisAcc = new BankAccount();

		// MyAcc properties
		MyAcc.id = 1;
		MyAcc.name = "Artem";
		MyAcc.balance = 150.999;
		MyAcc.popolnenie = 292.323;
		MyAcc.spisanie = 112.0;

		//YourAcc properties
		YourAcc.id = 2;
		YourAcc.name = "Lilly";
		YourAcc.balance = 90.187;
		YourAcc.popolnenie = 100.0;
		YourAcc.spisanie = 120.99;

		//HisAcc properties
		HisAcc.id = 3;
		HisAcc.name = "Bob";
		HisAcc.balance = 45.8;
		HisAcc.popolnenie = 20.00;
		HisAcc.spisanie = 30.99;
		//out console
		System.out.println(MyAcc.id + "\n" + MyAcc.name + "\n" + MyAcc.balance + "$" + "\n");
		System.out.println(YourAcc.id + "\n" + YourAcc.name + "\n" + YourAcc.balance + "$" + "\n");
		System.out.println(HisAcc.id + "\n" + HisAcc.name + "\n" + HisAcc.balance + "$" + "\n");

		MyAcc.showInfo();
		YourAcc.showInfo();
		HisAcc.showInfo();
	}
}