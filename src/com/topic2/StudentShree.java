package com.topic2;

import com.topic3.Student;

public class StudentShree extends Student {

	public static void main(String[] args) {
		Student sp=new Student();
		System.out.println(sp.id);
		//  System.out.println(sp.name); ------ Protected variable - Can't access
	    //	System.out.println(sp.std);  ------Default variable - Can't access
		//  System.out.println(sp.bloodGrp);  ------ Private variable - Can't access
		
		StudentShree ss=new StudentShree();
		System.out.println(ss.id);
		System.out.println(ss.name);
		//   System.out.println(ss.std);   -----  Default variable - Can't access
		//   System.out.println(ss.bloodGrp);   -----  Private variable - Can't access
	}

}
