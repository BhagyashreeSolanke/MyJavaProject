package com.topic3;

import java.util.Scanner;

public class Account {
	int accNo;
	String accType;
	int accBalance;
	int dep;
	int wtd;
	
	public void accept_details(int acn, String type, int bal)
	{
		accNo=acn;
		accType=type;
		accBalance=bal;
	}
	public void displayDitails()
	{
		System.out.println("Account Number = "+accNo+"\nAccount Type = "+accType+"\nAccount Balance = "+accBalance);
	}
	public void depositAmount()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an amount = ");
		int dep=sc.nextInt();
		int bal=accBalance+dep;
		System.out.println("Total Amount = "+bal);
	}
	
	public void withdrawAmount()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an amount = ");
		int wtd = sc.nextInt();
		if(accBalance>=wtd) 
		     {
			    int bal=accBalance-wtd;
		        System.out.println("Total Amount = "+bal);
			 } else {
				 System.out.println("Insufficient Balance");
			 }
		
	}
	public static void main(String[] args)
	{
		Account ac=new Account();
		ac.accept_details(100001234, "Saving", 100000);
		ac.displayDitails();
		ac.depositAmount();
		ac.withdrawAmount();
	}

}
