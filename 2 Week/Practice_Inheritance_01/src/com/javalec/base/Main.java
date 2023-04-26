package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		// Method 상속 
		child.getFather();
		child.getMather();
		child.getChild();
		
		//Field 상속
		System.out.println(child.pStr);
		System.out.println(child.cStr);
	}


}
