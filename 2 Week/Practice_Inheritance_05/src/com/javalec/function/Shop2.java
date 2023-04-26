package com.javalec.function;

public class Shop2 extends HQ {

	public Shop2() {

	}

	public void makeKim() {
		System.out.println("김치찌개(HQ) : 5,000원");
	}
	
	@Override
	public void makeBu() {
		System.out.println("부대찌개 : 5,000원");
	}

	@Override
	public void makeBi() {
		System.out.println("비빔밥 : 5,000원");
	}
	
	@Override
	public void makeSoon() {
		System.out.println("순대국 : 4,000원");
	}
	
	@Override
	public void makeBab() {
		System.out.println("공기밥 : 무료입니다.");
	}
}
