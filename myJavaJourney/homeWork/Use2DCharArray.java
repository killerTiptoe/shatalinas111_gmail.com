package org.example.homeWork.Lesson18;
/**
 * output is alphabet in english using the numbers
 * of rows in the array[] "size"
 */

import java.util.Arrays;

public class Use2DCharArray {
	public static void main(String[] args) {
		int[] size = {3, 12, 4, 7};
		char[][] symbs = new char[size.length][];
		char s = 'A';
		for (int i = 0; i < symbs.length; i++) {
			symbs[i] = new char[size[i]];
			System.out.print("{");
			for (int j = 0; j < symbs[i].length; j++) {
				symbs[i][j] = s;
				s++;
				if (j != symbs[i].length - 1) {
					System.out.print(symbs[i][j] + ",");
				} else {
					System.out.print(symbs[i][j]);
				}
			}
			System.out.println("}");
		}
		System.out.println("=========================");
		System.out.println(Arrays.deepToString(symbs));
		System.out.println("======================================================================================");
		for (int i = 0; i < symbs.length; i++) {
			for (int j = 0; j < symbs[i].length; j++) {
				System.out.print(symbs[i][j] + " ");
			}
		}
	}
}