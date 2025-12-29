package com.tnsif.polymorphism;
//same method with same paratemeters

class AnimalClass{
	void sound() {
		System.out.println("Animals can make sound");
	}
}


class Lion extends AnimalClass{
	void sound() {
		System.out.println("Lion roars......");
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		Lion L= new Lion();
		L.sound();
		
		
		/*
		 * Lion l = new Lion(); l.sound();
		 */
		
	}

}
