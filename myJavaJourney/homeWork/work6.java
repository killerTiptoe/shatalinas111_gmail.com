package org.example.homeWork;

public class work6 {
	work6() {
		this(0, 0, 0, 0, 0);
	}

	work6(int a1) {
		this(a1, 0, 0, 0, 0);
	}

	work6(int a2, int b2) {
		this(a2, b2, 0, 0, 0);
	}

	work6(int a3, int b3, int c3) {
		this(a3, b3, c3, 0, 0);
	}

	work6(int a4, int b4, int c4, int d4) {
		this(a4, b4, c4, d4, 0);
	}

	work6(int a5, int b5, int c5, int d5, int e5) {
		a = a5;
		b = b5;
		c = c5;
		d = d5;
		e = e5;
	}

	void summa(int a, int b, int c, int d, int e) {
		System.out.println(a + b + c + d + e);
	}

	int a;
	int b;
	int c;
	int d;
	int e;
}

class work6test {
	public static void main(String[] args) {
		work6 qqq = new work6();
		qqq.summa(10,20,30,40,50);
		qqq.summa(10, 20,30,40,0);
		qqq.summa(10,20,30,0,0);
		qqq.summa(10,20,0,0,0);
		qqq.summa(10,0,0,0,0);
		qqq.summa(0,0,0,0,0);
	}
}
