package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		int num1 = 10;

//		if(num1 % 2 ==0) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		}

//		Java에서 switch문은 case 마지막에 break를 적어주어야한다. 그리고, default값도 적어주는게 좋다.
//		"switch"문은 if가 계속 쓰이게 되어 지저분하게 되어 소스를 깔끔하게 만들때 쓰인다.
		
		switch (num1 % 2) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		default:
			break;
		}

	}

}
