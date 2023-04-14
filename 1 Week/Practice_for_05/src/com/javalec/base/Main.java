package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int num = 0;
//
//		System.out.print("***구구단*** \n숫자를 입력하세요!");
//		num = scanner.nextInt();
//
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(num + "*" + i + "=" + (num * i));
//		}

//		구구단 전체 출력중 짝수단과 곱해지는 수가 짝수인 경우에만 출력하기.
//		for (int dan = 2; dan <= 9; dan++) {
//			if (dan % 2 == 0) {
//				System.out.println("---" + dan + "단---");
//				for (int i = 1; i <= 9; i++) {
//					if (i % 2 == 0) {
//						System.out.println(dan + "x" + i + "=" + (dan * i));
//					}
//				}
//			}
//		}

//		구구단 전체 출력중 곱해지는 수가 홀수인 경우에는 곱해지는 수를 * 로 출력하기.
		for (int dan = 2; dan <= 9; dan++) {
			{
				System.out.println("---" + dan + "단---");
			}
			for (int i = 1; i <= 9; i++) {
				if (i % 2 == 0) {
					System.out.println(dan + "x" + i + "=" + (dan * i));
				} else {
					System.out.println(dan + "x*" + "=" + (dan * i));
				}
			}
		}
//		삼항연산자 사용
		for (int dan = 2; dan <= 9; dan++) {
			{
				System.out.println("---" + dan + "단---");
			}
			for (int i = 1; i <= 9; i++) {
					System.out.println(dan + "x" + (i % 2==0 ? i : "*") + "=" + (dan * i));
				
			}
		}
	}

}
