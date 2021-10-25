package oop;

public class ConstructorDemo {
	
	
	int x,y;
	ConstructorDemo()
	{
		x=100;
		y=100;
	}
	ConstructorDemo(int x ,int y)
	{
		this.x=x;
		this.y=y;
	}
	void add()
	{
		int sum= x+y;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		ConstructorDemo cd1= new ConstructorDemo();
		
	
		cd1.add();
	}

}
