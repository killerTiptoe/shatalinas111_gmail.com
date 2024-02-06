package org.example.homeWork.Lesson18;

/**
 * Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10],
 * заполни его таблицей умножения и выведи в консоли в виде таблицы умножения.
 */
public class MULTIPLICATION_TABLE {
	public static void main(String[] args) {
		int[][] MULTIPLICATION_TABLE = new int[10][10];

		for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
			for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
				MULTIPLICATION_TABLE[i][j] = (i+1)*(j+1);
				System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
