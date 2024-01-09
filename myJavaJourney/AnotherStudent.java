package org.example.homeWork;

public class AnotherStudent {
	AnotherStudent(int id3, String name3, String surname3, int age3, int course3, double a3, double b3, double c3) {
		name = name3;
		surname = surname3;
		id = id3;
		age = age3;
		course = course3;
		a = a3;
		b = b3;
		c = c3;
	}

	AnotherStudent(int id2, String name2, String surname2, int age2) {
		this(id2, name2, surname2, age2, 0, 0, 0, 0);
	}

	AnotherStudent() {
	}

	String name;
	String surname;
	int id;
	int age;
	int course;
	double a;
	double b;
	double c;
}

class AnotherStudentTest {
	double average(AnotherStudent st) {
		double result = (st.a + st.b + st.c) / 3;
		System.out.println("средний балл " + st.name + " " + st.surname + "\t : " + result);
		return result;
	}

	public static void main(String[] args) {
		AnotherStudent st1 = new AnotherStudent();
		st1.id = 1;
		st1.name = "Fedor";
		st1.surname = "Fedorov";
		st1.age = 19;
		st1.course = 1;
		st1.a = 10;
		st1.b = 9.8;
		st1.c = 9.5;

		AnotherStudent st2 = new AnotherStudent(2, "Petr", "Petrov", 34);
		st2.a = 7.8;
		st2.b = 8.8;
		st2.c = 6.9;

		AnotherStudent st3 = new AnotherStudent(3, "Ivan", "Ivanov", 30, 3, 9.0, 7.8, 7.8);

		AnotherStudentTest ttt = new AnotherStudentTest();
		ttt.average(st1);
		ttt.average(st2);
		ttt.average(st3);
	}
}