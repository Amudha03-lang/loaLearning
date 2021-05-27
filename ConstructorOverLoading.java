package com.loa.javalearning;

public class ConstructorOverLoading {

	String draw;
	
	ConstructorOverLoading() {
		System.out.println("Without Argument Constructor");
	}
	
	ConstructorOverLoading(String draw) {
	
		this.draw=draw;
		System.out.println("This is One Argument Construstor drawing " +draw);
	}
	public static void main(String[] args) {
		
		ConstructorOverLoading noObj = new ConstructorOverLoading();
		ConstructorOverLoading oneObj = new ConstructorOverLoading("Lion");

	}

}
