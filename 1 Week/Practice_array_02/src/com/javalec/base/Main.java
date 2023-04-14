package com.javalec.base;

public class Main {

	public static void main(String[] args) {
//		배열의 평균구하기
		int[] intNum = { 1, 5, 8, 12, 200, 1002 };
		int sum = 0; 
		double avg = 0;

//		합계처리
		for (int i = 0; i < intNum.length; i++) {
			sum += intNum[i];
		}
//		평균처리
		avg = (double)sum / intNum.length;

		System.out.println("평균값 : " + avg);
		System.out.println("합계 : " + sum);

	}

}
