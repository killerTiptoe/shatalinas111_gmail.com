package org.example.homeWork.Lesson14;

public class Test1 {
	static void time() {

		OUT:
		for (int hour = 0; hour < 6; hour++) {
			MID:
			for (int minute = 0; minute < 60; minute++) {
				if (hour > 1 && minute % 10 == 0) {
					break OUT;
				}
				IN:
				for (int second = 0; second < 60; second++) {
					if (second * hour > minute) {
						continue MID;
					}
					System.out.println(hour + ":" + minute + ":" + second);
				}
			}
		}
	}

	public static void main(String[] args) {
		time();
	}
}
