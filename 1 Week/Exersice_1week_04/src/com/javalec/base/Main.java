// 질문 : 숫자를 넣었을때 4개 까지의 단을 넣고, 가로가 아닌 세로로 정렬되게 구구단을 만드세요.
// -> 응용 : 역방향으로 단을 넣으세요.
// -> 응용 : 역방향으로 진행하게 만드세요.



package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int num02 = 0;

		System.out.print("Input your number : ");
		num = scanner.nextInt();

		for (num02 = 1; num02 <= 9; num02++) {
			for (int i = num; i < num + 4; i++) {
				System.out.print(i + " * " + num02 + " = " + String.format("%2d", i * num02) + "\t");
				if (i == (num + 3)) {
					System.out.println("");
				}
			}
		}
		
		System.out.println("-------------");
		
		for (num02 = 1; num02 <= 9; num02++) {
			for (int i = num + 3; i >= num; i--) {
				System.out.print(i + " * " + num02 + " = " + String.format("%2d", i * num02) + "\t");
				if (i == (num)) {
					System.out.println("");
				}
			}
		}
		

		System.out.println("-------------");
		
		for (num02 = 9; num02 >= 1; num02--) {
			for (int i = num; i < num + 4; i++) {
				System.out.print(i + " * " + num02 + " = " + String.format("%2d", i * num02) + "\t");
				if (i == (num + 3)) {
					System.out.println("");
				}
			}
		}

	}
}
