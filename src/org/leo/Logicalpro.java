package org.leo;

public class Logicalpro {

	public static void main(String[] args) {
		int d=7854587;
		int j=0;
		int temp=d;
		int count=0;
		int sum=0;
		while(d>0) {
		   int a=d/10;
		   int b=d%10;
		   j=b+(j*10);
		   count++;
		   sum=sum+b;
		   d=a;
		}
      System.out.println(j);
      if (temp==j) {
    	  System.out.println("Palindrome Number");
	} else {
         System.out.println("Not Palindrome Number");
	}
      System.out.println("Number of Digits;"+count);
      System.out.println("Sum of Numbers:"+sum);
	  System.out.println("Work Done BY A");
	  System.out.println("status Feature ");
	  System.out.println("code working well");
	
	}
	
    
}
