package com.javalec.base;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		// Map, Dictionary : Key와 Value로 구
		HashMap<String, String> hashMap = new HashMap<>();
		
		/// ("Key","Value")
		hashMap.put("Apple", "사과");
		hashMap.put("Banana", "바나나");
		
		System.out.println(hashMap);
		System.out.println(hashMap.get("Apple"));
		
		hashMap.remove("Apple");
		System.out.println(hashMap);

	}

}
