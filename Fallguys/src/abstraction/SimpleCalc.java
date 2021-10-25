package abstraction;

public abstract class SimpleCalc {
	void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	abstract void add(double x,double y);
	public static void main(String[] args) {
		

	}

}
