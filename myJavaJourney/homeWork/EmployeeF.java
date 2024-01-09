package org.example.homeWork;

public class EmployeeF {
	int id;
	String surname;
	int age;
	double salary;
	String department;

	EmployeeF(int id2, String surname2, String department2, int age2, double salary2) {
		id = id2;
		surname = surname2;
		department = department2;
		age = age2;
		salary = salary2;
	}

	double increaseSalary() {
		salary *= 2.0;
		return salary;
	}
}

class EmployeeTestF {
	public static void main(String[] args) {
		EmployeeF person1 = new EmployeeF(1, "Petrov", "Economic department", 45, 1350.90);
		EmployeeF person2 = new EmployeeF(2, "Ivanov", "Social department", 39, 870.50);

		person1.increaseSalary();
		System.out.println("Employee " + person1.id + ", " + person1.department + ", age " + person1.age + ", " + person1.surname + "'s salary is: " + person1.salary + "$" + "; " + "Bonuses increase up to x2: " + person1.increaseSalary() + "$");
		System.out.println("Employee " + person2.id + ", " + person2.department + ", age " + person2.age + ", " + person2.surname + "'s salary is: " + person2.salary + "$" + "; " + "Bonuses increase up to x2: " + person2.increaseSalary() + "$");

	}
}
