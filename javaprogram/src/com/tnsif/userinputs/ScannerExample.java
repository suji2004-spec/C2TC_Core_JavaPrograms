package com.tnsif.userinputs;
import java .util.Scanner;
public class ScannerExample {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your TNS UID: ");
		int uid = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter your Department: ");
		String dept = sc.nextLine();
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		
		System.out.println("The TNS UID is: " + uid);
		
		System.out.println("The Dept is: " + dept);
		System.out.println("The Name is: " + name);
		
		
	}
	


}
