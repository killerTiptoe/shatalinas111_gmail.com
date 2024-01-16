package org.example.homeWork.Lesson8;

public class Test2 {
	public final static double pi = 3.14;

	public double squareCircle(int radius1) {
		return radius1 * radius1 * pi;
	}

	public static double lengthCircle(int radius2) {
		return 2 * pi * radius2;
	}

	public void showInfo(int radius3) {

		System.out.println("radius : " + radius3 + "; " + "square of circle : " + squareCircle(radius3) + "; " + "length of circle : " + lengthCircle(radius3));
	}
}

class Test2test {
	public static void main(String[] args) {

		Test2 test = new Test2();
		test.squareCircle(7);
		Test2.lengthCircle(3);
		test.showInfo(5);

		System.out.println("=============================");
		System.out.println(Test2.lengthCircle(3));

		System.out.println(test.squareCircle(7));
	}
}
