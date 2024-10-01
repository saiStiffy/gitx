package java_course;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String na=sc.nextLine();
		Account ac=new Account();
		ac.setname(na);
		System.out.println(ac.getname());
		System.out.println("saikiran");

	}

}
