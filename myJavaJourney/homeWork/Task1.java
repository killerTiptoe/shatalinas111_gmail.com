package org.example.homeWork.Lesson17;


public class Task1 {
	public void email(String str) {
		int c = 0; // index искомого значения символа для вывода
		while (c <= str.length()) {
			if (c == str.indexOf("y") && c != str.indexOf(0)) {
				System.out.println(str.substring(3, 8));
			} else if (c == str.indexOf("m") && c != str.indexOf(11) && c != str.indexOf(31) && c != str.indexOf(38)) {
				System.out.println(str.substring(17, 21));
			} else if (c == str.indexOf("g")) {
				System.out.println(str.substring(30, 35));
			}
			c++;
		}
	}

	public static void main(String[] args) {
		Task1 out = new Task1();
		out.email("ya@yahoo.com; on@mail.ru; ona@gmail.com"); // выводит на экран ин-фу о том, какой почтой пользуемся
	}
}


