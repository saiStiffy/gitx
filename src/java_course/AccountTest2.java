package java_course;

import java.util.Scanner;

public class AccountTest2 {

	public static void main(String[] args) {
	Account2 ac3=new Account2("sai",30);
	Account2 ac2=new Account2("kiran",60);
	System.out.println(ac3.getbalance());
	
	System.out.printf("%s balance: $%.2f%n",ac3.getname(),ac3.getbalance());
	//System.out.printf(ac3.getname(),ac3.getbalance());
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter deposit money");
	double money1=sc.nextDouble();
	ac3.depositmoney(money1);

System.out.printf("%s balance: $%.2f%n",ac3.getname(),ac3.getbalance());
	//System.out.printf(ac3.getname(),ac3.getbalance());
	

System.out.printf("%s balance: $%.2f%n",ac2.getname(),ac2.getbalance());
System.out.println("enter deposit money");
 money1=sc.nextDouble();
ac2.depositmoney(money1);
System.out.printf("%s balance: $%.2f%n",ac2.getname(),ac2.getbalance());
	}
}
