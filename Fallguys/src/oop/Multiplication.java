package oop;

import interm.Additionoops;

public class Multiplication extends Additionoops{

	
	
	void multiple(int a,int b )
	
	{
		int m=a*b;
		System.out.println(m);
	}
	
		public static void main(String[] args) {
	
			Multiplication m1= new Multiplication();
			m1.multiple(12,14);
			m1.setX(100);
			m1.setY(300);
			m1.add();
			
	}

}
