package practice;

public class SortBasedOnRemainder {
	public static void main(String rrr[])
	{
		int inputArray[] = {10,91,29,72,45};
		
		for(int x= 0; x< inputArray.length ; x++)
		{
			for(int y = 0; y< inputArray.length-1; y++)
			{
				if(inputArray[y]%10> inputArray[y+1]%10)
				{
					int temp = inputArray[y];
					inputArray[y]= inputArray[y+1];
					inputArray[y+1]= temp;					
				}
			}
		}		
		for(int k=0; k< inputArray.length ; k++)
		{
			System.out.print(inputArray[k]);
			System.out.print(" ");
		}
	}
}
