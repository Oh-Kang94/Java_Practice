package com.javalec.base;

import com.javalec.function.HQ;
import com.javalec.function.Shop1;
import com.javalec.function.Shop2;
import com.javalec.function.Shop3;

public class Main {

	public static void main(String[] args) {
		
		HQ[] store= {new HQ(), new Shop1(),new Shop2(),new Shop3()};
		
		for(int i=0; i<store.length; i++) {
			store[i].makeKim();
			store[i].makeBu();
			store[i].makeBi();
			store[i].makeSoon();
			store[i].makeBab();
			
		}

	}

}
