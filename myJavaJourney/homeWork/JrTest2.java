package org.example.Day3;
/**
 * Вводим с клавиатуры число (это число будет кол-вом строк в двумерном массиве).
 * ВВодим с клавиатуры числа (они будут кол-вом элементов внутреннего массива).
 */

import java.util.Arrays;
import java.util.Scanner;

public class JrTest2 {
	public static int[][] multiArray;

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int row = Integer.parseInt(console.nextLine());
		multiArray = new int[row][];


		for (int i = 0; i < row; i++) {
				int col = Integer.parseInt(console.nextLine());
				multiArray[i] = new int[col];

		}
		System.out.println(Arrays.deepToString(multiArray));
	}
}
