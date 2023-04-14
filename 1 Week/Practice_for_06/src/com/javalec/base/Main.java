package com.javalec.base;

public class Main {

	public static void main(String[] args) {
//		for(int num =1; num<=9; num++) {
//			System.out.println();
//			for(int dan =2; dan<=9; dan++) {
//				System.out.print(dan+"x"+num+"="+(dan*num)+"\t");
//			}
//			
//		}

//		for(int num =2; num<=9; num = num+2) {
//			System.out.println();
//			
//			for(int dan =2; dan<=9; dan++) {
//				System.out.print(dan+"x"+num+"="+(dan*num)+"\t");
//			}
//			System.out.println();
//		}

		for (int num = 1; num <= 9; num++) {
			for (int dan = 2; dan < 10; dan++) {
				if (num % 2 == 0) {
					System.out.print(dan + " X " + num + " = " +String.format("%2d", (dan * num)) + "\t");
				} else {
					System.out.print(dan + " X * = " +String.format("%2d", (dan * num))+ "\t");
				}
				if (dan == 9) {
					System.out.println();
				}
			}
		}

	}

}
