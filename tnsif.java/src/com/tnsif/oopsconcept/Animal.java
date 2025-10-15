package com.tnsif.oopsconcept;

public class Animal {
String name;
	
	//Constructor
	
	Animal(String name){
		this.name = name;
	}
	
	void display() {
		System.out.println("Animal Name: "+name);
	}
}

class Dog extends Animal{

	String breed;
	
	Dog(String name , String breed){
		super(name);
		this.breed = breed;
	}
	
	void showDetails() {
		display();
		System.out.println("Dog Breed: "+breed);
	}
	
}



