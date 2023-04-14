package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// declare
		Scanner scanner = new Scanner(System.in);
		int sum = 0, tallest = 0, shortest = 1000;
		int tallMan = 0, shortMan = 0;
		double avg = 0;

		// array
		String name[] = { "James", "Cathy", "Kenny", "Martin", "Crystal" };
		int height[] = new int[name.length];

		// insert
		for (int i = 0; i < height.length; i++) {
			System.out.print(name[i] + "의 신장을 입력하세요!");
			height[i] = scanner.nextInt();
			sum += height[i];
			
			if (tallest <= height[i]) {
				tallest = height[i];
				tallMan = i;
			}
			if (shortest >= height[i]) {
				shortest = height[i];
				shortMan = i;
			}

		}

		// 평균구하기.
		avg = (double) sum / height.length;

		// 출력문.
		System.out.println("평균신장은 : " + (int) avg);
		System.out.println("가장 큰 사람은 " + name[tallMan] + " 이고 그 학생의 키는 " + tallest);
		System.out.println("가장 큰 사람은 " + name[shortMan] + " 이고 그 학생의 키는 " + shortest);
		
		/*내가 쓴 코드
		
		Scanner scanner = new Scanner(System.in);
		int sum =0, tallest = 0, shortest = 0;
		int tallMan = 0, shortMan=0;
		double avg = 0;
		String name[] = { "James", "Cathy", "Kenny", "Martin", "Crystal" };
		int height[] = new int[5];

		for (int i = 0; i < height.length; i++) {
			System.out.print(name[i] + "의 신장을 입력하세요!");
			height[i] = scanner.nextInt();
			sum += height[i];
		}
		//제일 키큰사람 키정하기
		if(height[0]>height[1]) {
			tallest = height[0];
		}else {tallest = height[1];}
		
		for (int i = 2; i < height.length; i++) {
			if(tallest<height[i]) {
				tallest = height[i];
			}
		}
		//제일 키작은사람 키정하기
		if(height[0]>height[1]) {
			shortest = height[0];
		}else {shortest = height[1];}
		
		for (int i = 2; i < height.length; i++) {
			if(shortest>height[i]) {
				shortest = height[i];
			}
		}
		
		// 사람에 맞는 index찾기.
		for(int i=0; i<height.length; i++) {
			if(tallest == height[i]) {
				tallMan = i;
			}
			if(shortest == height[i]) {
				shortMan = i;
			}
		}
		
		// 평균구하기.
		avg = (double)sum / height.length;
		
		System.out.println("평균신장은 : "+(int)avg);
		System.out.println("가장 큰 사람은 "+name[tallMan]+" 이고 그 학생의 키는 " +tallest);
		System.out.println("가장 큰 사람은 "+name[shortMan]+" 이고 그 학생의 키는 " +shortest);
		*/

	}

}
