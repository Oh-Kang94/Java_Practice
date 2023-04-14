package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		// 1) 일반적인 방법: 이전에 용량을 줄일려고 만듦.
//		Scanner scanner = new Scanner(System.in);
//		int firstNum = 0, secondNum = 0, saverNum = 0, sum = 0;
//		
//		System.out.print("첫번째 숫자를 입력하세요 : ");
//		firstNum = scanner.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 : ");
//		secondNum = scanner.nextInt();
//		
//		if(firstNum>secondNum) {
//			saverNum = firstNum;
//			secondNum = firstNum;
//			firstNum = secondNum; 
//		}
//		
//		for(int i= firstNum; i<=secondNum; i++) {
//			sum += i;
//		}
//		
//		
//		System.out.println("두수의 합계는 " + sum + "입니다.");

		Scanner scanner = new Scanner(System.in);
		int tempStart = 0, tempEnd = 0, startNum = 0, endNum = 0, sum = 0;

		System.out.print("첫번째 숫자를 입력하세요 : ");
		tempStart = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		tempEnd = scanner.nextInt();

		// 시작 숫자와 끝수자를 비교해서 작은수가 첫번째수로 큰수가 두번째수로 정리.
		if (tempStart > tempEnd) {
			startNum = tempEnd;
			endNum = tempStart;
		} else {
			startNum = tempStart;
			endNum = tempEnd;
		}
		// 범위 합계 구하기.
		for (int i = startNum; i <= endNum; i++) {
			sum += i;
		}

		// 출력하기.
		System.out.println("두수의 합계는 " + sum + "입니다.");

	}

}
