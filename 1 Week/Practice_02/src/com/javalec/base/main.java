package com.javalec.base;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
//		Declare
		Scanner scanner = new Scanner(System.in);
		int price = 0;
		String message = "";  //출력값멘트를 적는다. => 유지보수하기 편해짐.
		
//		Input
		System.out.print("금액을 입력하세요! : ");
		price = scanner.nextInt();
		
//		Process
		if(price >= 8000) {
			message = "너무 비쌉니다";
		}else if(price >= 5000) {
			message ="조금 비쌉니다";
		}else if(price >= 3000) {
			message = "적당한 금액입니다";
		}else {
			message = "싼 편입니다.";
		}
		
//		Output
		System.out.println(message);
		
	}

}
