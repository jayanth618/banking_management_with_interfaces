package banking.com;

import java.util.Scanner;

public class gpay extends user implements account {
	String moblie;
	int choice;
	double amt;

	gpay(String name, long accno) {
		super(name, accno);
		System.out.println("please login");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter moblie num");
		moblie=sc.nextLine();
		System.out.println("for deposite use choice 1,for withdraw use choice 2,to check yor balance use choice 3 ");
		System.out.println("enter your choice");
		choice=sc.nextInt();
		System.out.println("enter your amount");
		amt=sc.nextDouble();
		sc.close();
		if(moblie.length()==10&&(choice>0&&choice<4)&&amt>0) {
			System.out.println("login successul");
			login(moblie,choice,amt);
		}
		else {
			System.out.println("login unsccessful,please enter correct inputs");
		}
	}
	public void login(String moblie,int choice,double amt) {
		this.moblie=moblie;
		this.choice=choice;
		this.amt=amt;
		if(choice==1) {
			deposit(amt);
		}
		else if(choice==2) {
			withdraw(amt);
		}
		else if(choice==3) {
			checkbal();
		}
		else {
			System.out.println("invalid,enter correct choice");
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
