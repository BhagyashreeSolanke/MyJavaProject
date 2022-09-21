package com.topic2;

public class PatternABCD {
	public static void main(String[] args) {
		/*for(char i='A'; i<='D'; i++) {
			for(char j = 'A';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		/*for(char i='D';i>='A';i--) {
			for(char j='A';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		/*for(char i='A';i<='D';i++) {
			for(char j='D';j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		
		for(int i=1;i<=5;i++) {
			if(i%2!=0) {
				for(int j=1;j<=i;j++) {
					System.out.print(" "+j);
				}
			} else {
			     for(int k=1;k<=i;k++) {
				
				System.out.print(" "+(char)(64+k));
			}
			
		}System.out.println();
			
		
	}		
		
	
	}
}
