package org.example.Lesson6;

public class Employee {
	Employee(int id2, int age2, String surname2, String department2, double salary2) {
		id = id2;
		surname = surname2;
		department = department2;
		salary = salary2;
		age = age2;
	}

	Employee(int id2, int age2, String surname2) {
		id = id2;
		surname = surname2;
		age = age2;
	}

	Employee(int age2, String surname2) {
		surname = surname2;
		age = age2;
	}

	int id;
	String surname;
	double salary;
	int age;
	String department;

}

class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee(10, 80, "Petrov", "IT", 400.99);
		System.out.println(emp.salary + "\n" + emp.age + "\n" + emp.id + "\n" + emp.department + "\n" + emp.surname);

		Employee emp1 = new Employee(2, 90, "Ivanov");
		System.out.println(emp1.surname);
	}
}
