package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		String str1 = new String("abc");
		StringBuilder stringBulider = new StringBuilder("abcdefg");
		stringBulider.append("hijklmn");	// append에 대해 알아둬라.
		System.out.println(stringBulider);
		
		stringBulider.insert(3, "zzz");
		System.out.println(stringBulider);
		
		stringBulider.delete(3,6);
		System.out.println(stringBulider);
	}
	
	

}
