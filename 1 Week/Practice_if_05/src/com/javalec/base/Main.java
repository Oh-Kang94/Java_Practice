package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int score = 0;
		String grade = "";

		System.out.print("점수를 입력하세요 : ");
		score = scanner.nextInt();

		if (100 < score || score < 0) {
			System.out.println("오류입니다.");
			return;
			
		} else {
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else {
				grade = "D";
			}

			System.out.println("점수가 " + score + " 여서 " + grade + "학점 입니다.");

		}

	}
}
