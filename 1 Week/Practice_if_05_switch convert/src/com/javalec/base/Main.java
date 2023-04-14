package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int score = 0;
		String grade = "";

		System.out.print("점수를 입력하세요 : ");
		score = scanner.nextInt();

		if(score>100 || score<0) {
			System.out.println("점수를 잘 못 기입하였습니다.");
			return;}
		else {
			switch (score / 10) {
		case 10:
//			break를 적지 않으므로서, 10값을 가져도, 9와 같은 결과를 출력하게 해준다.
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		default:
			grade = "D";
			break;

		}
			System.out.println("점수가 " + score + " 여서 " + grade + "학점 입니다.");
		}
		
	}

}