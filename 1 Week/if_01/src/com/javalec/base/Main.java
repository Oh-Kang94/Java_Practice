package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		condition
		
		/*
		int i = 10;
		int j = 20;
		int k = 10; 도 되지만,
		
		int i =10, j =20, k = 10; */
		
//		선언문은 앞에쓰는게 가장좋다.
		int i = 0, j = 0, k = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		/* 
		String str1 = "abc";
		원래는 String str1 = new String("abc"); 
		-> 일반적으로 쓰는 방법. (객체지향언어이기 때문) */
		
		System.out.println("i의 값을 입력해주세요! : ");
		i = scanner.nextInt();
		
		System.out.println("j의 값을 입력해주세요! : ");
		j = scanner.nextInt();

		System.out.println("k의 값을 입력해주세요! : ");
		k = scanner.nextInt();
		
		if(j>i) {
			System.out.println("j가 i보다 큽니다.");
		}else if(j<i) {
			System.out.println("j가 i보다 작습니다.");
		}else {
			System.out.println("i는 j와 같습니다.");
		}
		
		
		if(i==k) {
			System.out.println("i와 k가 같습니다.");
		}else if(k>i) {
			System.out.println("k가 i보다 큽니다.");
		}else {
			System.out.println("k가 i보다 작습니다.");
		}
		
		System.out.println("---End---");
		
	}
	
}