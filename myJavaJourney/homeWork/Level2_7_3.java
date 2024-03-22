package org.example.homeWork.CodeMuTests;

/**
 * Дан массив с датой:
 * String[] arr = {"2025", "12", "31"};
 * Из элементов этого массива соберите дату в следующем формате:
 * "31-12-2025"
 */
public class Level2_7_3 {
	public static void main(String[] args) {
		String[] array = {"2025", "12", "31"};
		StringBuilder sb1 = new StringBuilder(); // 1 пример с помощью стрингбилдера
		sb1.append(array[2]).append("-").append(array[1]).append("-").append(array[0]);
		String resultDate = sb1.toString();
		System.out.println(resultDate);
		System.out.println("==========");
		String resultDate2 = String.format("%s-%s-%s", array[2],array[1],array[0]); // 2 пример с помощью метода format() класса String
		System.out.println(resultDate2);
	}
}