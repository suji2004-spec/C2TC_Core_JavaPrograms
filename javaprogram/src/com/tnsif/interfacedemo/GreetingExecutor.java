package com.tnsif.interfacedemo;

public class GreetingExecutor {

	public static void main(String[] args) {
		//lambda expression
		
				GreetingDemo gd = () -> {
					System.out.println("Hello Everyone");
				};
				
				gd.greet();
				

			}

		}
