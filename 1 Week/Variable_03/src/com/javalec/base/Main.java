package com.javalec.base;

public class Main {

	public static void main(String[] args) {
//	묵시적 변환과 명시적 변환
	int i1 = 10;
	double d1 = i1;
	
	System.out.println("d1의 데이터는 " + d1 +"입니다.");
	
	double d2 = 10;
//	실수는 정수로 바꿀수 없기때문에 따로 표기해주어야만 변환이 된다.
//	잘못된 예시) int i2 = d2;
	int i2 = (int)d2;
	
	System.out.println("i2의 데이터는 " + i2 +"입니다.");

	}

}
