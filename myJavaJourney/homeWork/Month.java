package org.example.homeWork.Lesson13;

public class Month {
	int numberOfMonth;

	Month(int numberOfMonth) {
		this.numberOfMonth = numberOfMonth;
	}
}

class MonthTest {
	public static void method1(Month m1) {
		switch (m1.numberOfMonth) {
			case 1:
				System.out.println("31 days per January");
				break;
			case 2:
				System.out.println("29 days per February");
				break;
			case 3:
				System.out.println("31 days per March");
				break;
			case 4:
				System.out.println("30 days per April");
				break;
			case 5:
				System.out.println("31 days per May");
				break;
			case 6:
				System.out.println("30 days per June");
				break;
			case 7:
				System.out.println("31 days per July");
				break;
			case 8:
				System.out.println("31 days per August");
				break;
			case 9:
				System.out.println("30 days per September");
				break;
			case 10:
				System.out.println("31 days per October");
				break;
			case 11:
				System.out.println("30 days per November");
				break;
			case 12:
				System.out.println("31 days per December");
				break;
			default:
				System.out.println("wrong number");
		}

	}

	public static void main(String[] args) {
		Month m1 = new Month(11);
		method1(m1);

	}
}

