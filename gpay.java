package banking.com;

import java.util.Scanner;

public class gpay extends user implements account {
	String moblie;
	int choice;
	double amt;
	Scanner sc=new Scanner(System.in);

	gpay(String name, long accno) {
		super(name, accno);
		System.out.println("please login");
		System.out.println("enter moblie num");
		moblie=sc.nextLine();
		int k=moblie.length();
		while(k>0) {
			if(k==10) {
				System.out.println("login done");
				menu();
				break;
				
			}
			else {
				System.out.println("login unscessful plzz re-enter");
				moblie=sc.nextLine();
				k=moblie.length();
				
			}
		}
	}
	public void menu() {
	    System.out.println("Choose payment option:");
        System.out.println("1. GPay");
        System.out.println("2. ATM");
        System.out.println("3. PhonePe");
        System.out.println("4. Paytm");
        System.out.print("Enter choice: ");
		choice();
	}
	public void choice() {
		System.out.println("enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("you chocise to deposte");
			System.out.println("enter your amount");
			amt=sc.nextDouble();
			deposit(amt);
			break;
		case 2:
			System.out.println("you chocise to withdraw");
			System.out.println("enter your amount");
			amt=sc.nextDouble();
			withdraw(amt);
			
			break;
		case 3:
			System.out.println("you chocise to check blance");
			checkbal();
			break;
		}
	}
	public void deposit(double amt) {
		if(amt>0) {
		bal=bal+amt;
		System.out.println("your balance is"+bal);}
		else {
			System.out.println("invalid amt ");
		}
		}
	public void withdraw(double amt) {
		if(bal>0&&amt>0) {
		bal=bal-amt;
		System.out.println(bal);
		}
		else {
			System.out.println("invalid amt");
		}
		}
	public void checkbal() {
		System.out.println(bal);
	}
}
