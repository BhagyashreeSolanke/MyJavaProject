package com.topic5;

class Constellation
{
	int stars;
}
class UrsaMinor extends Constellation
{
	void showUrsaMinor()
	{
		stars=7;
		System.out.println("Ursa Minor has "+stars+" stars.");
	}
}
class Gemini extends Constellation
{
	void showGemini()
	{
		stars=11;
		System.out.println("Gemini has "+stars+" stars.");
	}
}
public class Hier_2 {

	public static void main(String[] args) {
		UrsaMinor u=new UrsaMinor();
		u.showUrsaMinor();
		Gemini g=new Gemini();
		g.showGemini();

	}

}
