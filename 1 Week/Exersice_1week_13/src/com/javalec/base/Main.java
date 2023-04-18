package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0, pos =0;

		System.out.print("입력할 숫자의 개수? : ");
		count = scanner.nextInt();

		int numArray[] = new int[count];

		System.out.println(count+"개의 숫자를 입력하세요!:");
		for (int i = 0; i <count; i++) {
			System.out.print((i+1)+"의 숫자 :");
			numArray[i] = scanner.nextInt();
		}
		
		System.out.print("몇번째의 숫자를 삭제 하시곗습니까? :");
		pos = scanner.nextInt();
		
		for (int i = pos-1; i < count-1; i++) {
			numArray[i] = numArray[i+1];
		}
		
		System.out.println("----- 결과 -----");
		for (int i = 0; i < count-1; i++) {
			System.out.println(numArray[i]);
		}
	}

}
