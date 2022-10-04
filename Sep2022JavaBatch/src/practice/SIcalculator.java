package practice;

import java.util.Scanner;

public class SIcalculator {
	
	
	public static void main(String ar[])
	{		
			double principal,rate,time,simpleinterest;  // decimal value			
			principal=1000;
			rate=5;
			time=8;	
			Scanner sc = new Scanner(System.in);
			System.out.println("provide p, r, and t");
			principal= sc.nextDouble();
			rate= sc.nextDouble();
			time= sc.nextDouble();
			simpleinterest = (principal*rate*time)/100;
			System.out.println("Simple Interst is: " + simpleinterest);
			
	}
}
