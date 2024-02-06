package org.example.homeWork.Lesson18;
/**
 * Считать число с клавиатуры — это и будет размерность нашей будущей доски (длина стороны);
 * инициализировать массив array соответствующим значением;
 * "закрасить" массив так, чтобы получилась шахматная доска (черные клетки — '#', белые — ' ').
 * Начинаем заполнять массив с '#' с верхнего левого угла;
 * вывести массив на экран в таком виде, как в примере (каждую строку отдельно).
 */

import java.util.Scanner;

public class Chess {
	public static char[][] array;

	public static void main(String[] args) {
		//напишите тут ваш код
		Scanner console = new Scanner(System.in);

		int sizeOfArray = console.nextInt();
		char array[][] = new char[sizeOfArray][sizeOfArray];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i % 2 == 0 && j % 2 == 0) {
					array[i][j] = '#';
				} else if (i % 2 != 0 && j % 2 != 0){
					array[i][j] = '#';
				} else {
					array[i][j] = ' ';
				}
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
