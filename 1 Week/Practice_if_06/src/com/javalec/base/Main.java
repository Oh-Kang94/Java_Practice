package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		BMI 공식 = 몸무게(kg) / 신장(m) * 신장(m)
		
		Scanner scanner = new Scanner(System.in);
		double height = 0, weight = 0, bmi = 0;
		String result = "";

		System.out.println("*** BMI 계산기 ***");
		System.out.print("신장(cm)을 입력하세요 : ");
		height = scanner.nextDouble();
		// height = scanner.nextDouble / 100 (); => 이렇게 적어도 된다. 
		System.out.print("몸무게(kg)을 입력하세요 : ");
		weight = scanner.nextDouble();

		if (height <= 0 || weight <= 0 || height < weight) {
			System.out.println("몸무게나 신장은 0이하가 될 수 없습니다. "
					+ "+\n혹은, 몸무게와 신장을 바꿔적으셨습니다. "
					+ "+\n다시 적어주세요.");
			return;
		} else {
			bmi = weight / Math.pow(height*0.01,2);
			
			if (bmi >= 30) {
				result = "고도비만";
			} else if (bmi >= 25) {
				result = "비만";
			} else if (bmi >= 23) {
				result = "과체중";
			} else if (bmi >= 18.5) {
				result = "정상체중";
			} else if (bmi >= 0) {
				result = "저체중";
			}
		}
		
		System.out.println(">> 계산 결과: 귀하는 " +result +"입니다.");

	}

}
