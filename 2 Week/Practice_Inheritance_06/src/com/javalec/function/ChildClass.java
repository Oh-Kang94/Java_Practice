package com.javalec.function;

public class ChildClass extends ParentClass{

	public ChildClass() {
		System.out.println("Child Class");
		this.method();
		super.method();
	}
	
	@Override
	public void method() {
		System.out.println("Child Method");
		super.method();
	}
}
