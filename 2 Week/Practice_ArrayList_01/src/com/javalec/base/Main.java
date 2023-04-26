package com.javalec.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNum;
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		System.out.print("입력할 숫자의 갯수?");
		inputNum = scanner.nextInt();
		
		System.out.println(inputNum+"개의 숫자를 입력하세요.");
		
		for(int i =0; i<inputNum;i++) {
			System.out.print((i+1)+"의 숫자 :");
			arrayList.add(i,scanner.nextInt());
		}
		System.out.print("몇번째의 숫자를 삭제 하시겠습니까? :");
		arrayList.remove((scanner.nextInt()-1));
		
		scanner.close();
		
		System.out.println("------결과------");
		for(int i= 0; i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
	}
}
