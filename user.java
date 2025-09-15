package banking.com;

public class user {
	String name;
	long accno;
	public double bal;
	user(String name,long accno){
		this.name=name;
		this.accno=accno;
		System.out.println(this.name);
		System.out.println(this.accno);
	}

}
