package com.javalec.function;

public class ChildMenu extends ParentsMenu{
	
	public ChildMenu() {
		
	}
	
	public void makeHotDoen() {
		System.out.println("얼큰 된장국");
	}
	/// Overload
	public void makeHotDoen(String str1) {
		System.out.println("얼큰 된장국");
	}
	
	@Override
	//parents에 있어도,child에서 수정했으면, 수정한게 우선된다. 
	public void makeChung() {
		System.out.println("냄새없는 청국장");
	}

}
