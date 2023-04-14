package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String id = "", pwd = "";

		System.out.println("** Log In Check");

		System.out.print("User Id : ");
		id = scanner.next();

		System.out.print("Password : ");
		pwd = scanner.next();

//		String 은 == 을 못쓴다. .equals 을 써야한다.
		if (id.equals("root") && pwd.equals("1234")) {
			System.out.println("환영합니다.");
		} else {
			System.out.println("등록된 사용자가 아닙니다.");
		}
	}

}
