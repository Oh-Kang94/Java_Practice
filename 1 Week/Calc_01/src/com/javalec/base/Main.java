package com.javalec.base;

public class Main {

	public static void main(String[] args) {
//		연산자
		int i = 10;
		int j = 2;
		int k = 5;
		
//		자동 증감 연산자
//		아래 3개는 다 같은 소리임 
		i = i + 1;
		i += 1;
		i++;
		System.out.println("증가:" + i );
		
		i = i - 1;
		i -= 1;
		i--;
		System.out.println("감소:" + i );
		
//		동등 비교 관계 연산
		
//		같냐고 물어보는 건 "=="
//		cf) 판단문구로 많이 쓰이게 된다. 
		System.out.println(i == j);
//		같지 않냐는 !=
		System.out.println(i != j);
//		크지 않냐는 <
		System.out.println(i < j);
//		작지 않냐는 >
		System.out.println(i > j);
//		크거나 같냐는 >=
		System.out.println(i >= j);
//		작거냐 같냐는 <=
		System.out.println(i <= j);
	
//		논리 연산자
//		"&&"는 and 의 역할로 쓰임
		System.out.println((i>j) && (j>k));
//		"||"는 or 의 역할로 쓰임
		System.out.println((i>j) || (j>k));
		
//		삼항 연산자 (if보다 더 간단하게 쓰일수 있음)
//		'조건문' '?' 'true 이면, 여기 있는 값' : 아니면, 뒤를 실
		System.out.println(k == 5 ? "OK" : "None");
		System.out.println(i == 100 ? "OK" : "None");

		System.out.print("7이 3의 배수인가?");
		System.out.println(7%3 == 0 ? "\t3의 배수가 맞음\t" : "\t3의 배수가 아님\t");
		
//		모범답안.
		String decision = (7%3 == 0 ? "3의 배수가 맞음" : "3의 배수가 아님");
		System.out.println("7이 3의 배수인가?"+ decision);
		
	}

}
