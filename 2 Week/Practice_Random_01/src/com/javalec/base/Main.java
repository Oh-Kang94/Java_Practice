package com.javalec.base;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		for (int j = 1; j <= 6; j++) {
			int i = random.nextInt(45);
			System.out.println(i + 1); // 0부터 시작하기 때문
		}

	}

}
