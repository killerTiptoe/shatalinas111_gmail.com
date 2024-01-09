package org.example.lesson5;

import java.io.BufferedReader;
//  для чего необходим метод внутри метода, когда код короче и читабельнее и так.... возможно потом будет актуально!!!
// public class Tests {
//	int summa(int a, int b, int c) {
//		int result = (a + b + c);
//		return result;
//	}
//
//	int average(int a1, int b1, int c1) {
//		int result2 = summa(a1, b1, c1) / 3;
//		return result2;
//	}
//}

public class Tests {
	int average(int a, int b, int c) {
		int result = (a + b + c) / 3;
		return result;
	}
}


class TestAverage {
	public static void main(String[] args) {
		Tests t = new Tests();
		System.out.println(t.average(40, 50, 60));
	}
}
