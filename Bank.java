package aitise3b;

public class Bank {
	int accNo;
	String accHolderName;
	double balance;
	
	Bank(){
	
	}
	
	Bank(int accNo, String accHolderName, double balance){
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
	
	void display() {
		System.out.println("Account Number: " + accNo);
		System.out.println("Account Holder Name: " + accHolderName);
		System.out.println("Account Balance: " + balance);
	}
}
