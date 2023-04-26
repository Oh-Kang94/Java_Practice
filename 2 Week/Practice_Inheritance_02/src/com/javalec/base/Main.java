package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Divide;
import com.javalec.function.MulM;
import com.javalec.function.SubC;

public class Main {

	public static void main(String[] args) {

		int firstNum, secondNum;
		String result;
		Scanner scanner = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력하세요.");
		firstNum = scanner.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		secondNum = scanner.nextInt();

		scanner.close();
		
		// field
		Divide divide = new Divide();
		
		divide.add(firstNum,secondNum);
		divide.sub(firstNum,secondNum);
		divide.times(firstNum,secondNum);
		divide.divides(firstNum, secondNum);
		
		
		/// Method
		MulM mulM = new MulM();
		mulM.addition(firstNum, secondNum);
		mulM.subtraction(firstNum, secondNum);
		mulM.multiplication(firstNum, secondNum);

		// Constructor
		SubC subC = new SubC(firstNum,secondNum);
		subC.addition();
		subC.subtraction();
	}

}
