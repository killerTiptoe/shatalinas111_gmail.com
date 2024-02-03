package org.example.homeWork.Lesson17;

/*  you must create  method "equality" with 2 input parameters
	object of class type of StringBuilder (boolean return type)
	if value == true
	if value != false
 */
public class StrBuild {
	public static Boolean equality(StringBuilder sb1, StringBuilder sb2) {
		boolean result = true;
		if (sb1.length() == sb2.length()) {
			for (int i = 0; i < sb1.length(); i++) {
				if (sb1.charAt(i) != sb2.charAt(i)) {
					result = false;
					break;
				}
			}
		} else {
			result = false;
		}
		return result;
	}
}

class StrBuildTest {
	public static void main(String[] args) {
		StringBuilder sb3 = new StringBuilder("hello");
		StringBuilder sb4 = new StringBuilder("hello");
		StringBuilder sb5 = new StringBuilder("Hello");
		StringBuilder sb6 = new StringBuilder("hello ");
		// 1
		boolean finish = StrBuild.equality(sb3, sb4);
		System.out.println("1) " + finish); // true
		//2
		System.out.println("2) " + StrBuild.equality(sb5, sb3)); // false
		//3
		System.out.println("3) " + StrBuild.equality(sb3, sb6)); // false
		//4
		System.out.println("4) " + StrBuild.equality(new StringBuilder("God morning"), new StringBuilder("Good morning"))); // false
		//5
		System.out.println("5) " + StrBuild.equality(new StringBuilder(), new StringBuilder()));
	}
}
