package org.example.homeWork.Lesson20;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Создайте класс, в котором создайте метод abc. Инпут параметром данного метода
 * будет N-ое количество параметров типа String. Метод должен возвращать уже
 * отсортированный объект ArrayList из неповторяющихся объектов типа String,
 * взятых из параметра метода abc и выводить данный объект на экран.
 */
public class TestArrayList {
	public static ArrayList<String> abc(String... array1) {

		ArrayList<String> list = new ArrayList<>(Arrays.asList(array1));
		ArrayList<String> finishList = new ArrayList<>();
		for (String str: list) {
			if (!finishList.contains(str)) {
				finishList.add(str);
			}
		}
		System.out.println(finishList);
		return finishList;
	}

	public static void main(String[] args) {
		abc("ok", "nine", "ok", "OK", "GOOD", "!!!", "man");
	}
}