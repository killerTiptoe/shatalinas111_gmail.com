package org.example.homeWork.Lesson13;

public class Month_1 {
	public static void method1(int dayPerMonth) {
		switch (dayPerMonth) {
			case 2:
				System.out.println("29 days per February");
				break;
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.println("31 days per January");
				break;
			case 4, 6, 9, 11:
				System.out.println("30 days per June");
				break;
			default:
				System.out.println("wrong number");
		}

	}

	public static void main(String[] args) {
		method1(12);
		Month_1.method1(4); // I can not access the class, because static method in the same class
		method1(74);
	}
}
