package assignment2;

public class AddOdd {

	public static void main(String[] args) {
		
		int y=70;
		int sum=0;
		
		System.out.println("Adding odd number from 1-20");
		for (int i=50;i<=y;i++)
		{
			if (i % 2 != 0 )
			{
				sum =sum+i;
				
			}
	
		}
		System.out.println("Sum of odd numbers is "+ sum);
}}
