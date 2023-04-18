package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNum = 0, insertPos = 0, insertNum = 0, tempNum = 0;

		System.out.print("입력할 숫자의 갯수? :");
		inputNum = scanner.nextInt();

		int numArray[] = new int[inputNum + 1];

		System.out.println(inputNum + "개의 숫자를 입력하세요!");
		for (int i = 0; i < numArray.length - 1; i++) {
			System.out.print((i + 1) + "의 숫자 :");
			numArray[i] = scanner.nextInt();
		}

		System.out.print("숫자를 삽입하고자 하는 위치는 ? ");
		insertPos = scanner.nextInt();

		System.out.print("삽입하고자 하는 숫자는 ? :");
		insertNum = scanner.nextInt();

		scanner.close();

//		for (int i = 0; i < numArray.length; i++) {
//			if (i == insertPos - 1) {
//				tempNum = numArray[i];
//				for (int j = numArray.length - 2; j > insertPos - 1; j--) {
//					numArray[j + 1] = numArray[j];
//				}
//				numArray[i] = insertNum;
//				numArray[i + 1] = tempNum;
//			}
//		}
		
		// 선생님 코드 if안쓰고 사용.
		for (int i = insertNum-1; i < insertPos-1; i++) {
			numArray[i+1] = numArray[i];
		}
		
		numArray[insertPos-1] = insertNum;

		System.out.println("----- 결과 -----");
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}

	}

}
