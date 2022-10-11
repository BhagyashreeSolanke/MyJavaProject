package com.topic6;

// Write a program to create abstract class and provide the implementation
//   to abstract method inside the child class and show the uses of super keyword
//   with parent and child. 

abstract class Train{
	int trainNo=5348;
  // Constructor:
	Train(String bookingMode)
	{
		System.out.println(bookingMode);
	}
	
  // Abstract Method:
	abstract void onTime();
	
  // Concrete Method:
	void running()
	{
		System.out.println("Train runs slower than Metro.");
	}
	
}
class Metro extends Train{
  // Constructor:
	Metro(){
		super("Train's booking mode = Online");
		System.out.println("Metro's booking mode = Offline");
	}
	
  //implemented abstract method
	public void onTime() {
		System.out.println("Metro "+super.trainNo+" on time.");
	}
	
  //concrete method:
	void tellsMotion() {
		System.out.println("Metro "+super.trainNo+" runs like air.");
		super.running();
	}
}

public class Abstract_6 {

	public static void main(String[] args) {
	    Metro m=new Metro(); // Constructor get called.
	    m.onTime();
        m.tellsMotion();
        System.out.println(m.trainNo);
        
        Train t=new Metro();   //Constructor get called.
        t.onTime();
     // t.tellsMotion();   // could not get call bcoz this method present in child class.
        t.running();
        System.out.println(t.trainNo);
        
	    
	}

}
