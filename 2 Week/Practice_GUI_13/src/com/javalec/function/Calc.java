package com.javalec.function;

public class Calc {
	//fields
	int height, weight;
	double result;
	
	// constructor
	
	public Calc() {
		
	}

	public Calc(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	// Method;
	
	public double intbmi() {
		result = (double)weight / (height* height*0.0001);
		return result;
	}
	
	public String strbmi() {
		result = (double)weight / (height* height*0.0001);
		
		if(result<18.5 && result>0) {
			return "저체중";
		}else if(result<23 && result>=18.5) {
			return "정상";
		}else if(result<25 && result>=23) {
			return "비만";
		}else {
			return "고도비만";
		}
	}
}
