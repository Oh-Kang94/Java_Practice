package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		int tempStart = 0, tempEnd = 0, startNum = 0, endNum = 0;
//		int oddSum = 0, evenSum = 0; 
//		double sumAvg = 0, oddsumAvg = 0, evensumAvg = 0;
//
//		System.out.print("첫번째 숫자를 입력하세요 : ");
//		tempStart = scanner.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 : ");
//		tempEnd = scanner.nextInt();
//
//		// 시작 숫자와 끝수자를 비교해서 작은수가 첫번째수로 큰수가 두번째수로 정리.
//		if (tempStart > tempEnd) {
//			startNum = tempEnd;
//			endNum = tempStart;
//		} else {
//			startNum = tempStart;
//			endNum = tempEnd;
//		}
//
//		for (int i = startNum; i <= endNum; i++) {
//			if (i % 2 == 1) {
//				oddSum += i;
//			} else {
//				evenSum += i;
//			}
//		}
//
//		sumAvg = (double)(oddSum + evenSum) / (endNum - startNum +1);
//		oddsumAvg = (double)oddSum / (((endNum - 1) / 2) - ((startNum - 1) / 2));
//		evensumAvg = (double)evenSum / (((endNum - 1) / 2 + 1) - ((startNum - 1) / 2) + 1);
//
//		System.out.println("첫번째 수부터 끝숫자의 홀수의 합계는 " + oddSum + "입니다.");
//		System.out.println("첫번째 수부터 끝숫자의 짝수의 합계는 " + evenSum + "입니다.");
//		System.out.println("첫번째 수부터 끝숫자의 합계의 평균은 " + sumAvg + "입니다.");
//		System.out.println("첫번째 수부터 끝숫자의 홀수의 합계의 평균은 " + oddsumAvg + "입니다.");
//		System.out.println("첫번째 수부터 끝숫자의 짝수의 합계의 평균은 " + evensumAvg + "입니다.");
		
		Scanner scanner = new Scanner(System.in);
		int tempStart = 0, tempEnd = 0, startNum = 0, endNum = 0, sum = 0;
		int oddSum = 0, evenSum = 0, oddCount = 0, evenCount =0;
		double sumAvg = 0, oddsumAvg = 0, evensumAvg = 0;

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

		for (int i = startNum; i <= endNum; i++) {
			sum += i;
			if (i % 2 == 1) {
				oddSum += i;	// 홀수 관련.
				oddCount++;
			} else {
				evenSum += i;	// 짝수 관련.
				evenCount++;
			}
		}

		sumAvg = (double)sum / (endNum - startNum +1);
		oddsumAvg = (double)oddSum / oddCount;
		evensumAvg = (double)evenSum / evenCount;

		System.out.println("첫번째 수부터 끝숫자의 홀수의 합계는 " + oddSum + "입니다.");
		System.out.println("첫번째 수부터 끝숫자의 짝수의 합계는 " + evenSum + "입니다.");
		System.out.println("첫번째 수부터 끝숫자의 합계의 평균은 " + sumAvg + "입니다.");
		System.out.println("첫번째 수부터 끝숫자의 홀수의 합계의 평균은 " + oddsumAvg + "입니다.");
		System.out.println("첫번째 수부터 끝숫자의 짝수의 합계의 평균은 " + evensumAvg + "입니다.");

	}

}
