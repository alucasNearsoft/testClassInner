package com.companyname.col;

public class TestClass {
	
	private String nombre;
	
	public TestClass(String nombre) {
		this.nombre = nombre;
	}

	protected class InnerClass {
		
		public String getNombre() {
			return nombre;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
