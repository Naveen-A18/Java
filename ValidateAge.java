package aitise3b;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	InvalidAgeException(String msg){
		super(msg);
	}
}

public class ValidateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		
		try {
			if(age<18)
				throw new InvalidAgeException("Age cannot be less than 18");
		} catch(InvalidAgeException ae) {
			System.out.println("Error: " + ae.getMessage());
				
		}
		finally {
			
		}
		System.out.println("Age is: " + age);

	}

}
