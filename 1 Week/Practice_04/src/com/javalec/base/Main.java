package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double scoreKor = 0, scoreEng = 0, scoreMat = 0, avgr = 0;
//		평균값은 무조건 double(실수) 이다.
		String resultKor = "", resultEng = "", resultMat = "";
		String resultHigh = "보다 높습니다.", resultLow = "보다 낮습니다.", resultEql = "입니다.";

		System.out.println("국어점수를 입력하세요 : ");
		scoreKor = scanner.nextInt();
		System.out.println("영어점수를 입력하세요 : ");
		scoreEng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요 : ");
		scoreMat = scanner.nextInt();

		if (scoreKor < 0 || scoreEng < 0 || scoreMat < 0 || scoreKor > 100 || scoreEng > 100 || scoreMat > 100) {
			System.out.println("잘못된 값입니다.다시 입력하세요.");
			return;
		} else {
			avgr = (scoreKor + scoreEng + scoreMat) / 3;
			if (scoreKor > avgr) {
				resultKor = resultHigh;
			} else if (scoreKor < avgr) {
				resultKor = resultLow;
			} else {
				resultKor = resultEql;
			}

			if (scoreEng > avgr) {
				resultEng = resultHigh;
			} else if (scoreEng < avgr) {
				resultEng = resultLow;
			} else {
				resultEng = resultEql;
			}

			if (scoreMat > avgr) {
				resultMat = resultHigh;
			} else if (scoreMat < avgr) {
				resultMat = resultLow;
			} else {
				resultMat = resultEql;
			}

			System.out.println(
					"평균점수 : " + avgr + "\n국어점수는 평균" + resultKor + "\n영어점수는 평균" + resultEng + "\n수학점수는 평균" + resultMat);
		}
	}

}
