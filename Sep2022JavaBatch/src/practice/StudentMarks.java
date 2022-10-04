package practice;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String tt[])
	{
		String student_name;
		int  rollnumber;		 
		double m,e,sc,l, percent;
						
		Scanner scan = new Scanner(System.in);
		System.out.println("enter student name");
		student_name= scan.nextLine();
		
		System.out.println("enter roll number");
		rollnumber = scan.nextInt();
		
		System.out.println("enter marks one by one for maths,english, science, language");
		m = scan.nextDouble();
		e = scan.nextDouble();
		sc = scan.nextDouble();
		l = scan.nextDouble();
		
		percent = ((m+e+sc+l)/400)*100;
		
		System.out.println("------------Marksheet--------------------");
		System.out.println("name:"+student_name +"\t" + "rollNumber:"+ rollnumber);
		System.out.println("----------------------------------");
		
		System.out.println("maths \t\t" + m);
		System.out.println("english \t" + m);
		System.out.println("science \t" + m);
		System.out.println("language \t" + m);
		System.out.println("----------------------------------");
		System.out.println("percentage obtained:"+percent);
		
	}
}
