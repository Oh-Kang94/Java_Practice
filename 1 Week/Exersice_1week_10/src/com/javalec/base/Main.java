// 10개의 점수(0~99)를 입력방아 점수의 분포를 10점 간격의 등급으로 된 히스토 그램을 표시하라.

package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputArray[] = new int[10];
		int scoreArray[] = new int[10];

		System.out.println("Input score");

		for (int i = 0; i < inputArray.length; i++) {
			System.out.print((i + 1) + "의 score :");
			inputArray[i] = scanner.nextInt();
			if (inputArray[i] > 0 && inputArray[i] < 100) {
				inputArray[i] = inputArray[i] / 10;
			} else {
				System.out.println("0~99까지 입력가능합니다. 다시 입력하세요.");
				return;
			}
		}

		for (int j = 0; j < inputArray.length; j++) {
			for (int i = 0; i < 10; i++) {
				if (inputArray[j] == i) {
					scoreArray[i]++;
				}
			}
		}

		System.out.println("---------- Histogram ----------");

		for (int i = 9; i >= 0; i--) {
			System.out.print(i + "0 : ");
			for (int j = 0; j < scoreArray[i]; j++) {
				System.out.print("#");
			}
			System.out.println("");
		}

		// if 없이 ScoreArray 없이
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print((i + 1) + "의 score :");
			scoreArray[scanner.nextInt() / 10]++;
			if(scoreArray[i]<=0 && scoreArray[i]>10) {
				System.out.println("0~99까지 입력가능합니다. 다시 입력하세요.");
				return;
			}
		}

		System.out.println("---------- Histogram ----------");

		for (int i = (scoreArray.length - 1); i >= 0; i--) {
			
			System.out.print(String.format("%3d : ", i * 10));
			for (int j = 1; j < scoreArray[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
