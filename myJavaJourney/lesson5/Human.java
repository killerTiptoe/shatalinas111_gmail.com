package org.example.lesson5;

public class Human {
	String name;
	Car3 car;
	BankAccount bA;

	void ShowInfo() {
		System.out.println("----------------------------------");
		System.out.println("name: " + name + "color_auto: " + car.color + "cash_bank_account: " + bA.balance);
	}
}

class HumanTest {
	public static void main(String[] args) {
		Human H = new Human();
		H.name = "Ivan";
		H.bA = new BankAccount(1, 20239.433);
		H.car = new Car3("black", "v8");
		H.ShowInfo();
	}
}

class Car3 {
	Car3(String c, String m) {
		color = c;
		engine = m;
	}

	String color;
	String engine;

}

class BankAccount {
	BankAccount(int id2, double balance2) {
		id = id2;
		balance = balance2;
	}

	int id;
	double balance;


}