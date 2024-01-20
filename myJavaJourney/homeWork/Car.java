package org.example.Lesson11;

public class Car {
	String color;
	String engine;
	int doors;

	double price;

	public Car(String color, String engine, int doors, double price) {
		this.color = color;
		this.engine = engine;
		this.doors = doors;
		this.price = price;
	}
}

class CarTest {
	void doorsChange(Car c, int doors) {
		c.doors = doors;
	}

	void colorChange(Car c1, Car c2) {
		String color = c1.color;
		c1.color = c2.color;
		c2.color = color;
	}

	void engineChange(Car e, String engine) {
		e.engine = engine;
	}

	void priceChange(Car p1, Car p2) {
		double price = p1.price;
		p1.price = p2.price;
		p2.price = price;
	}

	public static void main(String[] args) {
		CarTest ct = new CarTest();
		Car car1 = new Car("red", "V12", 2, 250_000.99);
		Car car2 = new Car("black", "V10", 4, 190_999.77);

		System.out.println("before :");
		System.out.println(car1.color + " " + car1.engine + " " + car1.doors + " " + car1.price + "$");
		System.out.println(car2.color + " " + car2.engine + " " + car2.doors + " " + car2.price + "$");
		System.out.println("\t--------------------\t");

		ct.doorsChange(car1, 3);
		ct.doorsChange(car2, 2);
		ct.colorChange(car1, car2);
		ct.engineChange(car1, "W12");
		ct.engineChange(car2, "V6");
		ct.priceChange(car1, car2);
		System.out.println("after changes :");
		System.out.println(car1.color + " " + car1.engine + " " + car1.doors + " " + car1.price + "$");
		System.out.println(car2.color + " " + car2.engine + " " + car2.doors + " " + car2.price + "$");
	}
}
