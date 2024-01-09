package org.example.homeWork;

import org.example.lesson5.Tests;

public class Student {
	int numberTicket;
	String name;
	String surname;
	int year;
	double a; //оценка по мат
	double b; // оценка по экономике
	double c; // оценка по англ

	// вызвал метод среднего арифметического
	double average(double a, double b, double c) {
		double result = (a + b + c) / 3;
		return result;
	}
}

class StudentTest {
	public static void main(String[] args) {
		Student one = new Student();
		Student two = new Student();
		Student three = new Student();

		// one properties
		one.name = "Mike";
		one.surname = "Petrov";
		one.numberTicket = 123;
		one.year = 2020;
		one.a = 4.2;
		one.b = 3.5;
		one.c = 4.5;
		System.out.println(one.name + " " + one.surname + "\n" + "Номер студенческого билета:  " + one.numberTicket + "\n" + "Год обучения: " + one.year + "\n" + "Средний балл по предметам: " + one.average(4.2, 3.5, 4.5));
		System.out.println(" ");

		//two properties
		two.name = "Ann";
		two.surname = "Ivanova";
		two.numberTicket = 456;
		two.year = 2021;
		two.a = 3.8;
		two.b = 3.9;
		two.c = 5.0;
		System.out.println(two.name + " " + two.surname + "\n" + "Номер студенческого билета:  " + two.numberTicket + "\n" + "Год обучения: " + two.year + "\n" + "Средний балл по предметам: " + two.average(3.8, 3.9, 5.0));
		System.out.println(" ");

		// three properties
		three.name = "Petr";
		three.surname = "Petrov";
		three.numberTicket = 789;
		three.year = 2022;
		three.a = 4.8;
		three.b = 4.9;
		three.c = 3.2;
		System.out.println(three.name + " " + three.surname + "\n" + "Номер студенческого билета:  " + three.numberTicket + "\n" + "Год обучения: " + three.year + "\n" + "Средний балл по предметам: " + three.average(4.8, 4.9, 3.2));
		System.out.println(" ");
	}
}
