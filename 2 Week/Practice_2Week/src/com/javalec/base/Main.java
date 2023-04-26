package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Declare
		int inputNum;
		long result=1;
		Scanner scanner =new Scanner(System.in);
		// Input
		System.out.print("숫자를 입력하세요");
		inputNum = scanner.nextInt();
		// Process
		
		// Output
		for(int i=0;i<=inputNum;i++) {
			System.out.println(inputNum+"^ "+String.format("%2d", i)+" = "+String.format("%,14d",result));
			result = result * inputNum;
		}

	}

}
