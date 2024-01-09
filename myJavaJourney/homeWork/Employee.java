package org.example.homeWork;

public class Employee {
	int id;
	String surname;
	int age;
	double salary;
	String department;

	double yvelicheniesalary(double salary) {
		salary *= 2.8;
		return salary;
	}
}

class EmployeeTest {
	public static void main(String[] args) {
		Employee first = new Employee();
		Employee second = new Employee();

		first.id = 1;
		first.surname = "Ivanov";
		first.age = 45;
		first.salary = 1050.95;
		first.department = "Social department";

		second.id = 2;
		second.surname = "Petrov";
		second.age = 38;
		second.salary = 2140.50;
		second.department = "Economy department";

		System.out.printf("\n");
		System.out.println("id: " + first.id + "\n" + "Department: " + first.department + "\n" + "Surname: " + first.surname + "\n" + "Salary: " + first.salary + "$" + "\n" + "Bonuses x2: " + first.yvelicheniesalary(first.salary) + "$");
		System.out.println("____________________");
		System.out.println("id: " + second.id + "\n" + "Department: " + second.department + "\n" + "Surname: " + second.surname + "\n" + "Salary: " + second.salary + "$" + "\n" + "Bonuses x2: " + second.yvelicheniesalary(second.salary) + "$");
		System.out.println("____________________");
	}


}
