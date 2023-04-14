package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = 0; int sum = 0;

		System.out.println("몇 단계의 피라미드로 구성할까? : ");
		num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				sum ++;
				System.out.print(sum+"\t");
			}
			System.out.println();
		}
	}
}
