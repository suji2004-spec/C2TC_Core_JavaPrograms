package com.tnsif.nonaccessmodifiers;

public class FinalExample {
	
	
	final int x = 500;
	
	final void p() {
		System.out.println("Print the value of x: "+ x);
	}

	public static void main(String[] args) {
		
		FinalExample fe = new FinalExample();
		fe.p();
		
		
		

	}

}


