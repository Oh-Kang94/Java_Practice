package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		for (int num = 1; num <= 9; num++) {
			for (int dan = 2; dan < 10; dan++) {
				System.out.print((dan * num)%2 == 0 ? dan + " X " + num + " = " + String.format("%2d", (dan * num)) + "\t" : "\t\t");
				if (dan == 9) {
					System.out.println();
				}

			}

		}
	}
}
