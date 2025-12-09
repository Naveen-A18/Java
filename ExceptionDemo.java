package aitise3b;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		try {
		    int div = num1/num2;
		    System.out.println("Division is: " + div);
		}catch(ArithmeticException ae) {
			System.out.println("Cannot divide by zero");
		} catch (Exception e) {
			System.out.println("Exception Type: " +e.getClass());
		}finally {
			System.out.println("Finally block");
		}
		    
		try {
			System.out.println("Enter a String");
		   	String str = sc.next();
		   	int n = Integer.parseInt(str);
		}catch (NumberFormatException nf ) {
			System.out.println("Cannot convert alphabets to integer");
		}
		
		
		System.out.println("After the exception");
	}

}
