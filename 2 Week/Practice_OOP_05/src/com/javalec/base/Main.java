package com.javalec.base;

import com.javalec.function.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();

		car1.company = "기아자동차";

		System.out.println(car1.company);

		Car car2 = new Car(); // call by Value
		car2.company = "기아자동차";
		System.out.println(car2.company);

		System.out.println(car1 == car2);
		System.out.println(car1.company == car2.company);

		Car car3 = car1; // Call by reference
		System.out.println(car1 == car3);
		System.out.println(car3.company);

	}

}
