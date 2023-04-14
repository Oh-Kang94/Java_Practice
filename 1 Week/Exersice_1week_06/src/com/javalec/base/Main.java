// 더하기 할 숫자들의 개수를 정한 후 숫자를 입력받아사
// 입력한 숫자의 합을 구하는 프로그램 작성.

// 출력문 : 
//몇개의 숫자를 더할까요 ? :4
//4개의 숫자를 입력하세요.
//4
//3
//2
//1
//입력한 숫자의 합은 10 입니다.


package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0, sum = 0;

		System.out.print("몇개의 숫자를 더할까요 ? :");
		num = scanner.nextInt();
		int numArray[] = new int[num];

		System.out.println(num + "개의 숫자를 입력하세요.");
		for (int i = 0; i < num; i++) {
			numArray[i] = scanner.nextInt();
		}

		for (int i = 0; i < num; i++) {
			sum = sum + numArray[i];
		}

		System.out.println("입력한 숫자의 합은 " + sum + " 입니다.");
		
		// 보관된 데이터를 보여줄때만 Array 써라.
		
		int num02 = 0;
		System.out.print("몇개의 숫자를 더할까요 ? :");
		num = scanner.nextInt();
		

		System.out.println(num + "개의 숫자를 입력하세요.");
		for (int i = 0; i < num; i++) {
		     num02 = scanner.nextInt();
		     sum = sum + num02;
		}

		System.out.println("입력한 숫자의 합은 " + sum + " 입니다.");

	}

}
