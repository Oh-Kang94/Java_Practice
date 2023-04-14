package com.javalec.base;

public class Main {

	public static void main(String[] args) {
//		구구단 출력하기
		int[] dan = { 5, 3, 7, 9, 8 };

		for (int i = 0; i < dan.length; i++) {
			for (int num = 1; num <= 9; num++) {
				System.out.print(dan[i] + " X " + num + " = " + (dan[i] * num) + "\t");
				if (num == 9) {
					System.out.println("");
				}
			}
		}
		//
		
		String[] str = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri" , "Sat"};
		int[] intNum = {10,20,30};
		int intNumSum=0; 
		double[] doubleNum = {1.1, 1.2}; double doubleNumSum = 0;
		boolean[] boolNum = {true, false, true, false}; int boolNumSum = 0;
		
		//str 전체 출력해보기
		for(int i=0; i< str.length; i++) {
			System.out.print(str[i]+"\t");
		}
		System.out.println();
		
		//intNum 합계 구하기
		for(int i=0; i< intNum.length; i++) {
			intNumSum +=intNum[i];
		}
		System.out.println("합계는 "+intNumSum);
		
		//doubleNum 평균구하기
		for(int i=0; i< doubleNum.length; i++) {
			doubleNumSum += doubleNum[i];
		}
		System.out.println("doubleNum 평균은 "+(doubleNumSum/doubleNum.length));
		
		//boolNum중 true의 갯수 출력하기 
		for(int i=0; i< boolNum.length; i++) {
			if(boolNum[i]==true) {
				boolNumSum ++;
			}
		}
		System.out.println("true의 갯수는 " +boolNumSum);
	}

}
