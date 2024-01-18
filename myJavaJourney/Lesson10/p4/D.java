package org.example.homeWork.Lesson10.p4;

import org.example.homeWork.Lesson10.p1.A; // мог бы импортировать ...p1*; залетел бы и класс В и С р2 и р3!
import org.example.homeWork.Lesson10.p1.p2.p3.C;
import org.example.homeWork.Lesson10.p4.p5.E; // Возможно написание ... p4.p5*; все содержимое пакета р5!
import org.example.homeWork.Lesson10.p1.p2.B;

//import static org.example.homeWork.Lesson10.p1.p2.B.*;

import static org.example.homeWork.Lesson10.p1.p2.B.str2; // то же самое, что и строка 8, + access modifier public у переменной str2

public class D {
	public static void main(String[] args) {
		A classA = new A();
		System.out.println(classA.str1); // вывели переменную класс А

		B classB = new B();
		classB.showStr2(); // вывели переменную класс B

		System.out.println(str2); // можно так, потому что переменная public static

		C classC = new C();
		classC.showClassC(); // вывели переменную класс С

		E classE = new E();
		System.out.println(classE.q);// вывели переменную класс E потому что static переменная
	}
}
