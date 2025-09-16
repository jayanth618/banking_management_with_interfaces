package banking.com;

import java.util.Scanner;

public class mainaccount {
	
	String s;
	long l;
	static Scanner sc=new Scanner(System.in);
	public void input() {
	System.out.println("enter your name");
	String s1=sc.nextLine();
	this.s=s1;
	System.out.println("enter your account number");
	long l=sc.nextLong();
	this.l=l;
	chossepaymenttype();
	}	
	public void chossepaymenttype() {
		System.out.println("click 1 to gpay,click 2 to Atm,click 3 to phonepay,click 4 to paytym");
		System.out.println("click here to chosse payment method");
		int k=sc.nextInt();
		switch (k) {
		case 1:
			new gpay(s,l);
			break;
		case 2:
			new Atm(s,l);
			break;
		case 3:
			new phonepay(s,l);
			break;
		case 4:
			new paytm(s,l);
			break;
		default:
			System.out.println("invalid input please re-enter");
			 chossepaymenttype();
		}
	}

	public static void main(String[] args) {
		mainaccount m=new mainaccount();
		m.input();
	}

}
