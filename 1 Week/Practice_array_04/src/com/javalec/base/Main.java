package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
		
			int num[] = new int[100];
			int numNum = 0, sum = 0;
			
			System.out.println("숫자의 갯수는 최대 100개 입니다. 몇개의 숫자를 입력하시겠습니까?");
			numNum = scanner.nextInt();
			
			
			
			if(numNum<100&&numNum>0) {
			System.out.println(numNum + "개의 숫자를 입력하세요.");

			for (int i = 0; i < numNum; i++) {
				System.out.print((i + 1) + "번숫자: ");
				num[i] = scanner.nextInt();
				sum += num[i];
			}
//		순서대로 
			System.out.println("--------------\n입력하신 숫자는 다음과 같습니다.\n");
			for (int i = 0; i < numNum; i++) {
				System.out.println((i + 1) + ")" + num[i]);

			}

//		등록순으로 나열
			System.out.println("--------------\n입력하신 숫자는 다음과 같습니다.\n");
			for (int i = numNum - 1; i >= 0; i--) {
				System.out.println((i + 1) + ")" + num[i]);

			}
			System.out.println("\n합계 : " + sum);
			}else {
				System.out.println("다시 입력하세요");
			}
		}
	}

}
