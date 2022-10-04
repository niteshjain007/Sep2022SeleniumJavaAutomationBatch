package practice;

public class Demo1 {
	
	public static void main(String qw[])
	{
		int rollnumber = 20;
		
		int myNum = 5;               // Integer (whole number)
		float myFloatNum = 5.99f;    // Floating point number
		char myLetter = 'D';         // Character
		boolean myBool = true;       // Boolean
		String myText = "Hello how are you";     // String
		
		
		byte num1= (byte)75;
		byte num2 = (byte)95;
		byte result = (byte)(num1 + num2);
		
		System.out.println("result="+ result);
		
		// 170 ===  127 : extra 43  (-128+43) : -85
		
		int m1= 20;
		int m2 = 34;
		int  res = (m1 + m2);
		
		System.out.println("result="+ res);
		
		
		boolean w= true;
		
		
		int c = 34 ;
		int v = 5;
		 
		double k = c/(double)v;   //  34/5 = 6.8	// int k = 6.8 // 	int k = 6
		System.out.println("result = "+k);
		
		
		
		int h = 30;
		byte j = 25;
		h = j;  // implicit typecasting
		
		System.out.println("value of h =" +h);
		
		//
		
		h = 90;
		j = (byte)h;  // explicit typecast
		
		// h is still integer
		
		System.out.println(28%5);
		
		int b= 9;
		b++;              // b = b+1
		System.out.println("b="+ b);
		
		b--; b--; b--;  // b = b-1
		System.out.println("b="+ b);
		
			
		
		int u = 34;
		u = 56;
		System.out.println("u = "+ u);
		
		System.out.println(9>5);
		
		
		boolean check = (10==12);
		
		System.out.println("hey.. $%^&*( hwhihwi answer of comparison = " +check);
		
		
		System.out.println((9>8) && (12>7));
		
		boolean d = true;
		boolean m = !d;
		
		System.out.println(!(45< 23));
	
		System.out.println("new line added for homepage test");
	}
	
}
