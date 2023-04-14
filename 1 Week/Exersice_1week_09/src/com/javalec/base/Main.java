// 학생수가 4명이고, 과목이 3과목일 경우의 점수 합계와 평균 구하기 기능 추가.

package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//declare
		Scanner scanner = new Scanner(System.in);
		int korArray[] = new int[4];
		int engArray[] = new int[4];
		int matArray[] = new int[4];
		int sumArray[] = new int[4];
		double avgArray[] = new double[4];
		String[] subArray = { "Korean", "English", "Mathematics", "Total", "Average" };

		//input
		System.out.println(subArray[0] + "의 성적을 입력 : ");
		for (int i = 0; i < 4; i++) {
			System.out.print("No" + (i + 1) + "의 성적은 :");
			korArray[i] = scanner.nextInt();
		}

		System.out.println(subArray[1] + "의 성적을 입력 : ");
		for (int i = 0; i < 4; i++) {
			System.out.print("No" + (i + 1) + "의 성적은 :");
			engArray[i] = scanner.nextInt();
		}

		System.out.println(subArray[2] + "의 성적을 입력 : ");
		for (int i = 0; i < 4; i++) {
			System.out.print("No" + (i + 1) + "의 성적은 :");
			matArray[i] = scanner.nextInt();
		}

		//proceed
		for (int i = 0; i < 4; i++) {
			sumArray[i] = korArray[i] + engArray[i] + matArray[i];
			avgArray[i] = (double) sumArray[i] / 3;
		}
		
		//output
		for (int i = 0; i < 5; i++) {
			System.out.print("\t" + subArray[i]);
		}
		System.out.println("");
		for (int i = 0; i < 4; i++) {
			System.out.print("No" + (i + 1) + "\t");
			System.out.print(korArray[i] + "\t");
			System.out.print(engArray[i] + "\t");
			System.out.print(matArray[i] + "\t\t");
			System.out.print(sumArray[i] + "\t");
			System.out.print((int) avgArray[i] + "\t");
			System.out.println();
		}
	}

}
