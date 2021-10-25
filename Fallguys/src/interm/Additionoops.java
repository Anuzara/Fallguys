package interm;

public class Additionoops {
	private int x;
	private int y;
	 
	public void add()
	{
		int sum;
		sum=x+y;
		System.out.println("Sum " +sum);
	}
	int add(int a, int b, int c) {
		int sum= a+b+c;
		return sum;	
		
	}
 protected static double add(double a,double b, double c) {
	double sum=a+b+c;
	return sum;
	
}
	public void setX(int x) {
	this.x = x;
}
public void setY(int y) {
	this.y = y;
}
	public static void main(String[] args) {
		
		Additionoops a1= new Additionoops();
a1.x=100;
a1.y=50;
a1.add();
Additionoops a2= new Additionoops();
a2.x=7500;
a2.y=350;
a2.add();
int s1=a1.add(10,10,10);

System.out.println(s1);
System.out.println(a1.add(10.5,10.4,10.1));


	}

}
