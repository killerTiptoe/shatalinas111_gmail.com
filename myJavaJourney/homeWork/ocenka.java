package org.example.homeWork;

public class ocenka {
	int id;
	String name;
	String surname;
	int course;
	double mathAverageGrade;
	double ecoAverageGrade;
	double engAverageGrade;
}

class ocenkaTest {
	double srednyaOcenka(ocenka test) {
		double result = (test.mathAverageGrade + test.ecoAverageGrade + test.engAverageGrade) / 3;
		System.out.println("Average grade for " + "id " + test.id + " - " + "student of " + test.course + " course " + test.name + " " + test.surname + ": " + result);
		return result;
	}

	public static void main(String[] args) {
		ocenka St1 = new ocenka();
		St1.id = 1;
		St1.name = "Ivan";
		St1.surname = "Ivanov";
		St1.course = 3;
		St1.mathAverageGrade = 8.7;
		St1.ecoAverageGrade = 6.6;
		St1.engAverageGrade = 9.0;

		ocenka St2 = new ocenka();
		St2.id = 2;
		St2.name = "Petr";
		St2.surname = "Petrov";
		St2.course = 4;
		St2.mathAverageGrade = 6.6;
		St2.ecoAverageGrade = 9.7;
		St2.engAverageGrade = 10.0;

		ocenka St3 = new ocenka();
		St3.id = 3;
		St3.name = "Gleb";
		St3.surname = "Zgiglov";
		St3.course = 3;
		St3.mathAverageGrade = 8.1;
		St3.ecoAverageGrade = 7.9;
		St3.engAverageGrade = 8.4;

		ocenkaTest finalTest = new ocenkaTest();
		finalTest.srednyaOcenka(St1);
		finalTest.srednyaOcenka(St2);
		finalTest.srednyaOcenka(St3);
	}


}
