//결과값:
//Input your decimal no. : 5
//*
//**
//***
//****
//*****
//****
//***
//**
//*

package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int i = 0;

		System.out.print("Input your decimal no. : ");
		num = scanner.nextInt();

		for (i=1; i<= num; i++) {
			for (int j=1; j< i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (i=num-1; i> 0; i--) {
			for (int j=i; j> 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
// if 써서 해결.
		for (i = 1; i < num * 2; i++) {
			if (i <= num) {
				for (int j = 1; j < i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = -i+num*2 ; j > 0; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

}
