package Practice;

public class Test1 {
	public static void order() {
		int i,j;
		for(i=1;i<=10;i++)
		{
			j=11-i;
			System.out.println(i+" "+j);
		}		
	}
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.order();
	}
}
