package org.example.homeWork.Lesson8;


public class Test1 {
	static double method1(double a, double b, double c) {
		return a * b * c;
	}

	static void method2(int a, int b) {
		System.out.println("результат операции деления : " + a / b + ", остаток от деления чисел: " + a % b);
	}
}

class Test1Test {
	public static void main(String[] args) {
		System.out.println(Test1.method1(10, 3, 4));
		Test1.method2(20, 3);
		System.out.println("---------------------------");
		System.out.println(Test1.method1(12.2, 3.5, 5.9));
		Test1.method2(89, 34);
	}
}
