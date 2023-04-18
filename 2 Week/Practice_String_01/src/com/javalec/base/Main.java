package com.javalec.base;

import java.util.Scanner;

public class Main {
// public <=> private ( 다른데에서는 못쓴다.)
//	function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner.close();

		String str0 = new String("가나다라마바사");
		String str1 = "abcd";
		String str2 = "EFGH";
		String str3 = "    JKLMNOP     ";
		String strNum = "010-1212-3434";
		
		System.out.println(str1+str0.concat(str1)); // string(변수).concat(연결해주고싶은 String변수) = 문자열 연결
		System.out.println(str0.substring(3)); // 문자열 자르기
		System.out.println(str0.substring(0,2));
		System.out.println(str1.length()); //문자 길이를 알려준다.
		System.out.println(str1.toUpperCase().concat(str2)); // 대문자로 만들어준다.
		System.out.println(str2.toLowerCase());
		System.out.println(str1.charAt(2)); // 몇번째글자인지 알려주는 것.
		System.out.println(str1.indexOf('c')); // a라는 글자가 몇번째에 있는지 알려주는 것. index 상으로
		System.out.println(str1.equals(str2)); // == 을 대체.
		System.out.println(str3.trim()); // space를 없에는 도구.
		System.out.println(str1.replace('a','A')); // a를 A로 바꾸는 도구.
		System.out.println(str1.replaceAll("bc", str3));
		
		System.out.println(strNum.replaceAll("1212-3434", "****-****")); // 최악의 방법.
		System.out.println(strNum.replaceAll(strNum.substring(4), "****-****"));
		System.out.println(strNum.substring(0,4).concat("****-****"));
		

	}

}
