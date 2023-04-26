package com.javalec.function;

public class FirstSon {

	public void Firstson() {
		// TODO Auto-generated method stub

	}
	
	public void takeChoc() {
		Mamabag.choco = Mamabag.choco-1;
		if(Mamabag.choco<0) {
			System.out.println("첫째는 초코파이가 먹고싶어요");
		}else
		{
			System.out.println("첫째는 맛있게 먹었어요.");
		}

	}
}
