package assignment3;

public class Fibbonacci {

	public static void main(String[] args) {
	int a1=0,a2=1,a3;
	int count =10;
	System.out.print(a1+" "+a2);
	
	for(int i=2;i<count;i++)
	{
		a3=a1+a2;
		System.out.print(" "+a3);
		a1=a2;
		a2=a3;
		
	}

	}

}
