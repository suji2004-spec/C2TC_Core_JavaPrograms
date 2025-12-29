package com.tnsif.userinputs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderExample {

	
		public static void main(String[] args) throws IOException {


			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			
			System.out.println("Enter College Name: ");
			String college = br.readLine();
			
			System.out.println("Enter College Code: ");
			int code = Integer.parseInt(br.readLine());
			
			System.out.println("The College Name is: "+ college);
			System.out.println("The College Code is: "+code);
		}

	}
