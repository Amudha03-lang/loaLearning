package com.loa.javalearning;

public class FunctionReturnTypeClass {
	
	public Integer returnAmt = 10500;
	
	public Integer AmounttobeReturned() {
		
		System.out.println("This function returns the amount");
		return returnAmt;
	}

	public static void main(String[] args) {
		

		FunctionReturnTypeClass getAmtobj = new FunctionReturnTypeClass();
		Integer recAmt= getAmtobj.AmounttobeReturned();
	    System.out.println("Thanks for the amount :" + recAmt);
	}
	

}
