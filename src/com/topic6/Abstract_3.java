package com.topic6;

abstract class Mobile3{
	int x;
	
	abstract void ringing();
	
		Mobile3(int str){
		System.out.println("Mobile "+str);
	}
		void sendingSms()
		{
			System.out.println("Mobile can send sms");
		}
}
class Nokia extends Mobile3{
	 Nokia(){
		 super(346);
	 }
	 void ringing() {
		System.out.println("Apple is ringing...");
	}
}
public class Abstract_3 {

	public static void main(String[] args) {
       Nokia n= new Nokia();
       n.ringing();
       n.sendingSms();
        
       Mobile3 m=new Nokia();
       m.sendingSms();
       m.ringing();
       
      
       
       
       


	}

}
