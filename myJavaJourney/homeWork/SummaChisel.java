package org.example.homeWork;

public class SummaChisel {
	int sum() {
		int result = 0;
		System.out.println("Summa chisel :" + result);
		return result;
	}

	int sum(int a) {
		int result1 = a;
		System.out.println("Summa chisel :" + result1);
		return result1;
	}

	int sum(int b, int c) {
		int result2 = b + c;
		System.out.println("Summa chisel :" + result2);
		return result2;
	}

	int sum(int d, int e, int f) {
		int result3 = d + e + f;
		System.out.println("Summa chisel :" + result3);
		return result3;
	}

	int sum(int g, int h, int i, int j) {
		int result4 = h + i + g + j;
		System.out.println("Summa chisel :" + result4);
		return result4;
	}

	int sum(int k, int l, int m, int n, int o) {
		int result5 = k + l + m + n + o;
		System.out.println("Summa chisel :" + result5);
		return result5;
	}
}

class SummaChiselTest {
	public static void main(String[] args) {
		SummaChisel summa = new SummaChisel();
		summa.sum();
		summa.sum(10);
		summa.sum(20, 30);
		summa.sum(40, 50, 60);
		summa.sum(70, 80, 90, 100);
		summa.sum(110, 120, 130, 140, 150);
	}
}
