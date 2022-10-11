package com.topic6;

class Watch
{
	String type;
	final void read(String type)
	{
		this.type=type;
	}
}
class Titan extends Watch
{
//	final void read(String t)   //can not override the final method of watch.
//	{
//		System.out.println("Titan");
//	}
	void show()
	{
		System.out.println("Titan is "+type+" watch.");
	}
}
public class Override_StaticMethod {

	public static void main(String[] args) {
		Titan t=new Titan();
		t.show();

	}

}
