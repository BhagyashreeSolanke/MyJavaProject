package com.topic6;

abstract class Mobile4{
	abstract void ringing();
	
	public void sendSms() {
		System.out.println("Mobile is use for sending sms.");
	}
}

class Apple2 extends Mobile4{
	void ringing() {
		System.out.println("Apple is ringing..");
	}
}
public class Abstract_2 {
	public static void main(String[] args) {
		/*Apple2 a=new Apple2();
		a.ringing();
		a.sendSms();*/
		
		Mobile4 m=new Apple2();
		m.ringing();
		m.sendSms();
	}

}
