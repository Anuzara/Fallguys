package advance;

public class ArraysortMax {

	public static void main(String[] args) {
		int []score= {99,98,78,65,100,62,35,35,99,92,88};
		int max= -1;
		for(int count=0;count<score.length;count++)
		{
			if (max<score[count])
				max=score[count];
			
		}
System.out.println(max);
	}

}
