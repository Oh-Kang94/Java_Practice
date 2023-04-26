package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.HQ;
import com.javalec.function.Shop1;
import com.javalec.function.Shop2;
import com.javalec.function.Shop3;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String where;

		while (true) {
			System.out.println("어디지점인가요?");
			where = scanner.next();

			switch (where) {
			case "HQ":
				HQ hq = new HQ();
				System.out.println(where + "-------");
				hq.makeKim();
				hq.makeBu();
				hq.makeBi();
				hq.makeSoon();
				hq.makeBab();
				break;
			case "Shop1":
				HQ shop1 = new Shop1();
				System.out.println(where + "-------");
				shop1.makeKim();
				shop1.makeBu();
				shop1.makeBi();
				shop1.makeSoon();
				shop1.makeBab();
				break;
			case "Shop2":
				HQ shop2 = new Shop2();
				System.out.println(where + "-------");
				shop2.makeKim();
				shop2.makeBu();
				shop2.makeBi();
				shop2.makeSoon();
				shop2.makeBab();
				break;
			case "Shop3":
				HQ shop3 = new Shop3();
				System.out.println(where + "-------");
				shop3.makeKim();
				shop3.makeBu();
				shop3.makeBi();
				shop3.makeSoon();
				shop3.makeBab();
				break;
			default:
				System.out.println("다시 입력하세요.");
			}
			System.out.println("--------------");
		}
	}

}
