package com.tnsif.exceptionhandling_2;
public class NestedTryCatchExample {
	public static void main(String[] args) {
		try {
            int[] arr = {10, 20, 30};
            try {
                System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Invalid array index");
            }
            int result = 8 / 0; // ArithmeticException
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Outer Catch: Cannot divide by zero");
        }
        System.out.println("Program finished");
	}
}
