package org.example.lesson5;

public class Car {
	String color;
	String engine;
	int speed;

	int gaz(int skorost) {
		speed += skorost;
		return speed;
	}

	int tormoz(int skorost) {
		speed -= skorost;
		return speed;
	}

	void showInfo() {
		System.out.println("cvet : " + color + "\n" + "motor : " + engine + "\n" + "skorost: " + speed);
		System.out.println(" ");
	}
}

class CarTest {

	public static void main(String[] args) {
		Car CarTest = new Car();
		CarTest.speed = 120;
		CarTest.engine = "V10";
		CarTest.color = "green";

		CarTest.showInfo();
		CarTest.gaz(60);
		CarTest.showInfo();
		CarTest.tormoz(180);
		CarTest.showInfo();
	}
}
