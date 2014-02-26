package com.companyname.col;

public class AnotherClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestClass.InnerClass innerClass = new TestClass("Socrates").new InnerClass();
		System.out.println(innerClass.getNombre());
	}

}
