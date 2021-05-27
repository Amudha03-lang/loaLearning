package com.loa.javalearning;

public class ParameterizedConstructor {

	String animal_name;
	String animal_type;
	
	
	ParameterizedConstructor(String animal_name,String animal_type) {
		
		this.animal_name=animal_name;
		this.animal_type=animal_type;
		
	}
	
	public void animaldetails() {
		System.out.println("The Name of the Animal is " +this.animal_name+ " and its type is " +this.animal_type );
	}
	
	public static void main(String[] args) {
		ParameterizedConstructor aniObj = new ParameterizedConstructor("Duck","Omnivores");
		aniObj.animaldetails();
		
		ParameterizedConstructor aniObj1 = new ParameterizedConstructor("Lion","Carnivores");
		aniObj1.animaldetails();
	}

}
