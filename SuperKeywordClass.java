package com.loa.javalearning;


class Parentclass {
	int x = 50;
	
	}

class childclass extends Parentclass {
	int x = 10;
	
	void display( ) { 
		System.out.println("Inside Childclass is "+super.x);
	}
	

}

public class SuperKeywordClass {

	public static void main(String[] args) {
		
		childclass newObj =new childclass();
		newObj.display();

	}

}
