package assignment3;

public class Factorial {

	
	
	public static void main(String[] args) {
		
	int fact=1;
	int y=5;
	for(int i=1;i<=y;i++)
	{
		fact=fact*i;
		
	}
	System.out.println("Factorial of "+y +" is "+ fact);
	}
}
