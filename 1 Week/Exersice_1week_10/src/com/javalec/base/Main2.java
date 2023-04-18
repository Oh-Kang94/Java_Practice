package com.javalec.base;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		String [] histo = new String[10];
		
		System.out.println("Input score");
		
		for (int i = 0; i < histo.length; i++) {
			histo[i] = "";
			System.out.print((i + 1) + "의 score :");
			score = scanner.nextInt()/10;
			for(int j =0; j<score; j++) {
				histo[i] =  histo[i] + "*";
			}
		}

		System.out.println("---------- Histogram ----------");

		for (int i = (histo.length - 1); i >= 0; i--) {
			
			System.out.print(String.format("%3d : ", i * 10));
			System.out.println(histo[i]+"\n");
		}
	}

}
