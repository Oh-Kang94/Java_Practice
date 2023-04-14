//		결과값 : 
//10^ 0 =            1
//10^ 1 =           10
//10^ 2 =          100
//10^ 3 =         1000
//10^ 4 =        10000
//10^ 5 =       100000
//10^ 6 =      1000000
//10^ 7 =     10000000
//10^ 8 =    100000000
//10^ 9 =   1000000000
//10^10 =  10000000000
// 을 만드세요.


package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		double result = 1;

		for (int i = 0; i <= 10; i++) {
			System.out.println("10^" + String.format("%2d",i) + " = " + String.format("%12.0f",result));
			result *= 10;
		}
	}
}
