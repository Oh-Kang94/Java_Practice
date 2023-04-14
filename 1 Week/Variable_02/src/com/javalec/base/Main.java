package com.javalec.base;

public class Main {

	public static void main(String[] args) {
//		변수 
		int num1 = 20;
		int num2 = 10;
		
		int num3;
		num3 = num1 + num2;
		
		//문자는 char 글자 한글자만 가능. 
		char char1 = 'A';
		char char2 = '가';
		
//		원래는 Java에는 String이 없다. 그래서, 나중에 만들어서 객체형 변수로 나중에 만들어서, 앞자리가 Capital 이다. 
		String str1 = "대한민국";
		
		double dNum1 = 10.231;
 		
//		boolean : 참 거짓만 가리게 된다. 가장 데이터 양이 작은 변수로도 일컬어짐. 
		boolean boolNum1 = true;
		boolean boolNum2 = false;
		
		System.out.println(num1);
		System.out.println(num3);
		System.out.println(char1);
		System.out.println(str1);
		System.out.println(dNum1);
		System.out.println(boolNum1);
	}

}
