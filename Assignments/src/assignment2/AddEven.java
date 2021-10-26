package assignment2;

public class AddEven {

	public static void main(String[] args) {
		int y =20;
		int sum =0;
		System.out.println("Even Number from 100-125");
		for( int i=1;i<=y;i++)
		{ 
			if(i %2 == 0)
			{
				sum =sum+i;

			}
		}
		System.out.println(sum);
	}

}
