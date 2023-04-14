// 입력한 수의 Factorial 구하기 (4! = 4*3*2*1)
// 출력문:
// Input your decimal no. : 4
// 4's factorial value = 	24





package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = 0; 
		long value = 1;
		
		System.out.print("Input your decimal no. : ");
		num = scanner.nextInt();
		
		for(int i = 1; i<=num; i++) {
			value *= i;
		}
		
		System.out.println(num+"'s factorial value = \t"+value);
	}
	

}
