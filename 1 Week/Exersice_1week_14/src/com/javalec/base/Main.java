package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		int custom = 0;
		int customArray[] = new int[5];

		while (menu != 4) {
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.현황");
			System.out.println("4.종료");
			System.out.print("번호를 입력하세요!");
			menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.print("고객번호 :");
				custom = scanner.nextInt();
				System.out.print("금액 :");
				customArray[custom - 1] = customArray[custom - 1] + scanner.nextInt();

				System.out.println("입금 결과 : 고객번호 :" + custom + " 잔액 : " + customArray[custom - 1]);
				System.out.println("--------------");
				break;
			case 2:

				System.out.print("고객번호 :");
				custom = scanner.nextInt();
				System.out.print("금액 :");
				customArray[custom - 1] = customArray[custom - 1] - scanner.nextInt();
				if (customArray[custom-1] >= 0) {
					System.out.println("입금 결과 : 고객번호 :" + custom + " 잔액 : " + customArray[custom - 1]);
					System.out.println("--------------");
					
				} else{
					System.out.println("잔액이 부족합니다!");
				}
				break;
			case 3:
				System.out.println("\t 고객명 \t 잔액");
				System.out.println("\t ---- \t ----");
				for (int i = 0; i < 5; i++) {
					System.out.println("\t" + (i + 1) + "\t" + customArray[i]);
				}
				System.out.println("--------------");
				break;
			case 4:
				System.out.println(">>>>Thank you<<<<");
				break;
			default:
				System.out.println("1~4까지만 입력하세요.");
				break;
			}
			scanner.close();

		}

	}

}
