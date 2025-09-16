package banking.com;

public class user {
	String name;
	long accno;
	public double bal;
	user(String name,long accno){
		this.name=name;
		this.accno=accno;
		System.out.println("your name"+this.name);
		System.out.println("your account number"+this.accno);
	}

}

