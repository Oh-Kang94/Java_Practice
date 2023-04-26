package com.javalec.function;

public class Shop3 extends HQ{

	public Shop3() {

	}

	@Override
	public void makeKim() {
		System.out.println("김치찌개 : 6,000원");
	}

	public void makeBu() {
		System.out.println("부대찌개 : 7,000원");
	}

	public void makeBi() {
		System.out.println("비빔밥 : 7,000원");
	}

	public void makeSoon() {
		System.out.println("순대국 : 6,000원");
	}

	public void makeBab() {
		System.out.println("공기밥(HQ) : 1,000원");
	}

}
