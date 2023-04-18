package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int countNum = 0, findNum = 0;
		int data = 0;

		System.out.print("입력할 숫자의 개수는?");
		countNum = scanner.nextInt();
		
		int numArray[] = new int[countNum];
		
		System.out.println(countNum+"개의 숫자를 입력하세요!:");
		
		for (int i = 0; i < numArray.length; i++) {
			System.out.print((i + 1) + "의 숫자 :");
			numArray[i] = scanner.nextInt();
		}
		
		System.out.print("검색할 숫자는 ? :");
		findNum = scanner.nextInt();

		for (data = 0; data < numArray.length; data++) {
			if (numArray[data] == findNum) {
				System.out.println(findNum + "의 위치는 " + (data+1) + "번째 입니다.");
				break;
			}
		}
		
		if(data == countNum) {
			System.out.println(findNum+"는 존재하지 않습니다.");
		}
		// for문 밖에서 오류띄우려면, 변수를 전역변수로 선언해야한다. 
	}

}
