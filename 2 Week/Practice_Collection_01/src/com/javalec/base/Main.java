package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// ArrayList
		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");

		System.out.println(arrayList);

		System.out.println(arrayList.size());
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		// 수정
		arrayList.set(1,"str22");
		System.out.println(arrayList);
		
		//삭제
		arrayList.remove(1);
		System.out.println(arrayList);
		
		//삽입
		arrayList.add(1,"AAA");
		System.out.println(arrayList);
		
		//전체 삭제
		arrayList.clear();
		System.out.println(arrayList);

	}

}
