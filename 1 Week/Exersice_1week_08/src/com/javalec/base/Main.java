// 몇개의 숫자를 입력할지 결정한 후,
// 숫자를 입력하고, 이중 최대값의 위치와 최대값을 구하라.
// 출력문 예시;
//입력할 숫자의 개수 ? (100개 미만) : 5
//5개의 숫자를 입력하세요!
//4
//11
//12
//14
//15
//입력한 숫자중 최대값은 15이고,5번째 값 입니다.



package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numMain = 0, maxNum = 0, numSub = 0, maxIndex = 0;

		System.out.print("입력할 숫자의 개수 ? (100개 미만) : ");
		numMain = scanner.nextInt();

		if (numMain < 100) {
			System.out.println(numMain+"개의 숫자를 입력하세요!");
			for (int i = 1; i <= numMain; i++) {
				numSub = scanner.nextInt();
				if (maxNum < numSub) {
					maxNum = numSub;
					maxIndex = i;
				}
			}

			System.out.println("입력한 숫자중 최대값은 " + maxNum + "이고," + maxIndex + "번째 값 입니다.");
		} else {
			System.out.println("다시 입력해주십시오.");
		}

		// ---- Array를 쓸때 ---

		while(true) {
		System.out.print("입력할 숫자의 개수 ? (100개 미만) : ");
		numMain = scanner.nextInt();

		int numArray[] = new int[numMain];
		
		if (numMain < 100) {
			System.out.println(numMain+"개의 숫자를 입력하세요!");
			for (int i = 0; i < numMain; i++) {
				numArray[i] = scanner.nextInt();
				if (maxNum < numArray[i]) {
					maxNum = numArray[i];
					maxIndex = i+1;
				}
			}
			System.out.println("입력한 숫자중 최대값은 " + maxNum + "이고," + maxIndex + "번째 값 입니다.");
		} else {
			System.out.println("다시 입력해주십시오.");
		}
		}
	}

}
