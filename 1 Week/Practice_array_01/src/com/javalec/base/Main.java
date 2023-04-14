package com.javalec.base;

public class Main {

	public static void main(String[] args) {
//		Array
//		문자열 배열 데이터 7개를 생성.

//		String[] str = new String[7];
//		int [] num = new int[10];
//		
//		str[0] = "일요일";
//		str[1] = "월요일";
//		str[2] = "화요일";
//		str[3] = "수요일";
//		str[4] = "목요일";
//		str[5] = "금요일";
//		str[6] = "토요일";

		// Create Read Update Delete => CRUD

		String[] str = { "일요일 ", "월요일 ", "화요일 ", "수요일 ", "목요일 ", "금요일 ", "토요일 " };

//		배열의 개수 확인.		
		System.out.println(str.length);

//		일요일 <- Sunday로 수정
		str[0] = "Sunday ";

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

//		정수 배열 intArray에 1부터 10까지 등록하는 문장을 구성하고,출력
//		String[] sntArray = {
//				for(int i=1;i<=10;i++) {
//			"i,";
//					
//		}
//		};
//		

//		Creation
		int[] intArray = new int[10];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i;
		}
		
//		Read
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
//		Read : data가 짝수인 합계 구하기. 		
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] % 2 == 0) {
				sum += intArray[i];
			}
		}
		
		System.out.println("합계 : " + sum);

	}

}
