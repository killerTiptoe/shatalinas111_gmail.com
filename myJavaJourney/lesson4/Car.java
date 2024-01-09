package org.example.lesson4;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class Car {
	String color = "black";
	String engine = "V6";
}

class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.engine = "V8";
		car1.color = "red";

		System.out.println("color: " + car1.color + "\n" + "engine: " + car1.engine);
	}

}
