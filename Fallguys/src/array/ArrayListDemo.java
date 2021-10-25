package array;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
			int []mScore = {99,78,90,87,56,34,53,89,97,93};
			ArrayList<Integer> ninety = new ArrayList<Integer>();

			for(int i=0; i<mScore.length;i++)
			{
				if(mScore[i]>=90)
			ninety.add(mScore[i]);
			}
System.out.println(ninety);	
System.out.println("size "+ninety.size());
	}

}
