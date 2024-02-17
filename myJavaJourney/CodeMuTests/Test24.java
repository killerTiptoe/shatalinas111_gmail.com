package org.example.homeWork.CodeMuTests;

/**
 * Даны три символа:
 * char chr1 = '1';
 * char chr2 = '2';
 * char chr3 = '3';
 * Сложите значения этих символов как целые числа.
 */
public class Test24 {
	public static void main(String[] args) {
		char chr1 = '1';
		char chr2 = '2';
		char chr3 = '3';

		int num1 = Integer.parseInt(String.valueOf(Integer.valueOf(chr1))); // преобразование символов в их числовое значение
		int num2 = Integer.parseInt(String.valueOf(Integer.valueOf(chr2))); // здесь будет значение чаров по таблице юникода
		int num3 = Integer.parseInt(String.valueOf(Integer.valueOf(chr3)));
		System.out.println(num1 + num2 + num3);

		int q1 = Character.getNumericValue(chr1);
		int q2 = Character.getNumericValue(chr2);
		int q3 = Character.getNumericValue(chr3);
		System.out.println(q1 + q2 + q3);

		// Для конвертации char в integer используйте следующую короткую комбинацию: int a; char b; a=b-'0';
		int sum = chr1 - '0' + chr2 - '0' + chr3 - '0'; // преобразование символов в типизацию int
		System.out.println(sum);
		System.out.println("--------------");


		String s1 = String.valueOf(chr1); // приводим значение переменной к строковому типу данных, сохраняя значение
		String s2 = String.valueOf(chr2);
		String s3 = String.valueOf(chr3);
		System.out.println(s1+s2+s3); //  склеиваем значения переменных, так как у нас data type string у переменных

		int i1 = Integer.parseInt(s1); // приводим значение переменной к интовому значению типа данных
		int i2 = Integer.parseInt(s2);
		int i3 = Integer.parseInt(s3);
		System.out.println(i1+i2+i3); // поскольку у нас data type int - то будет операция сложения
	}
}
