package org.example.Lesson6;

public class MethodOverloading {
	void show(int var) {
		System.out.println(var);
	}

	void show(String str) {
		System.out.println(str);
	}

	void show(boolean b) {
		System.out.println(b);
	}

}

class MethodOverloadingTest {
	public static void main(String[] args) {
		MethodOverloading mO = new MethodOverloading();
		mO.show(400);
		mO.show(true);
		mO.show("fkdkfdjkfjdkf");
	}
}
