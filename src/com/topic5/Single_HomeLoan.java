package com.topic5;

class RBI
{
	float homeLoanInterest=8.1f;
}
class SBI extends RBI{
	void show() {
		System.out.println("Home Loan is "+homeLoanInterest+"%");
	}
}
public class Single_HomeLoan {

	public static void main(String[] args) {
		SBI s=new SBI();
		s.show();   

	}

}
