package com.javalec.base;

import com.javalec.function.SumEvenOdd;

public class Main {

	public static void main(String[] args) {
		// 1~10까지의 합계를 구하고, 그 합이 짝수인지 홀수 인지 판별
		// 절차지향
//		int sum = 0; 
//		
//		for(int i =1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println("1~10까지의 합은"+sum);
//		
//		if(sum%2 == 0 ) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
		// 객체지향
		SumEvenOdd sumEvenOdd = new SumEvenOdd();
		int result03 = sumEvenOdd.sumCalc(1, 10);		
		System.out.println("1부터 10까지의 합계는 "+result03);
		
		int result2 = sumEvenOdd.sumCalc(1, 1000);		
		System.out.println("1부터 10까지의 합계는 "+result2);

		String result01 = sumEvenOdd.evenOdd();
		System.out.println("홀짝은 "+result01);
		
	}
	
}