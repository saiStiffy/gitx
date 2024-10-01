package java_course;

public class Account2 {
	private String name;
	private double balance;
	
	public Account2(String name, int balance) {
		this.name=name;
		this.balance=balance;
	}
	
	public void depositmoney(double money) {
		balance=balance+money;
	}
	public double getbalance() {
		return balance;
	}
	public void setname(String name) {
	this.name=name;
	}
	public String getname() {
		return name;
	}
}
