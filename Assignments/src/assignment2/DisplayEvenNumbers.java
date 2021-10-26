package assignment2;

public class DisplayEvenNumbers {

	public static void main(String[] args) {
		int y =125;
		System.out.println("Even Number from 100-125");
		for( int i=100;i<=y;i++)
		{ 
			
			if(i %2 == 0)
			{
				System.out.print(i+",");
			}
		}

	}

}
