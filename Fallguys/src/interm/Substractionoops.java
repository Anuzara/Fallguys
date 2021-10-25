package interm;

public class Substractionoops extends Additionoops {
	//Method Overloading
	//1) number of parameter is different
	//2)same number of parameter with different data type
	
	
	void sub(int a ,int b)
	{
		int s;
		if(a>b)
			s=a-b;
		else
			s=b-a;
		System.out.println(s);
	}
	void sub(double a ,double b)
	{
		double s;
		if(a>b)
			s=a-b;
		else
			s=b-a;
		System.out.println(s);
	}
	void sub(int a ,int b,int c)
	{
		int s;
		if(a>b)
			s=a-b+c;
		else
			s=b-a+c;
		System.out.println(s);
	}
		int add(int a, int b, int c) {
			int sum= a+b+c;
			return sum;	
			
		}
	//Polymorphism is two types Method Overloading(Compile time polymorphism)
	// and Method overriding(Runtime Polymorphism
	public static void main(String[] args) {
		
		Substractionoops s1= new Substractionoops();
		s1.sub(100,55);
		s1.sub(100.5, 35.4);
		s1.sub(12, 14, 20);
		int sum=s1.add(20, 30, 40);
		System.out.println("Sum"+sum);
	}

}
