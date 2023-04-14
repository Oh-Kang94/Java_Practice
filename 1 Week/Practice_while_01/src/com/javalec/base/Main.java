package com.javalec.base;

public class Main {

	public static void main(String[] args) {
//		1부터 100까지의 합계 구하기.
		int sum =0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
//			sum = sum + i;
		}

		System.out.println(sum);
		
//		while문의 사용.
		
		sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum +=i;
			i++;
		}
		
		System.out.println(sum);
		
//		while-boolean조건에서, break를 사용해 조건 만들기.
		sum =0;
		i = 1;
		while(true) {
			sum+=i;
			i++;
			if(i>100) {
				break;
			}
		}
		System.out.println(sum);
		
//		break의 사용.
		
		for(int j=1; j<1000000; j++) {
			if(j==10) {
				System.out.println("Find!");
				break;
			}
		}
		
//		continue 의 사용.
		for(int j=1; j<=10; j++) {
			if(j==5) {			
				continue;
				// 밑으로 가지말고, 반복문으로 다시 올라가라는 명령어(가끔 요긴하게 쓰인다.)
			}
			System.out.println(j);
		}
		
	}

}