package com.javalec.function;

public class Shop1 extends HQ {
	
	public Shop1() {

	}
	
	@Override
	public void makeKim() {
		System.out.println("김치찌개 : 4,500원");
	}
	
	@Override
	public void makeBu() {
		System.out.println("부대찌개 : 5,000원");
	}
	
	public void makeBi() {
		System.out.println("비빔밥(HQ) : 6,000원");
	}
	
	@Override
	public void makeSoon() {
		System.out.println("순대국 : 판매하지 않습니다.");
	}

	public void makeBab() {
		System.out.println("공기밥(HQ) : 1,000원");
	}
}
