package com.javalec.base;

public class Main {

	public static void main(String[] args) {
//		작성은 문맥 선언문 -> 출력문
//		그다음은 기능별로 작성하는게 나중에 유지보수하기 좋다. 
		
//		선언문 
//		선언문들은 출력문 위로 올리는 편이 좋다.
		String nationKorean = "대한민국";
		String nationEnglish = "Korea";
		String fruits = "\nApple\t사과\t\nBanana\t바나나\t";
		
//		출력문 (꾸미는 것은 데이터가 아니다. 꾸미는 것은 출력문에 넣어야한다. 
		System.out.println("**"+nationKorean+"**"+fruits);
		System.out.println();
		System.out.println("**"+nationEnglish+"**"+fruits);

	}

}
