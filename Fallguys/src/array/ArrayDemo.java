package array;

public class ArrayDemo {

	public static void main(String[] args) {
		int []mScore = {99,78,90,87,56,34,53,89};
		//length=7| min index= 0,max=length-1
		int sum=0;
		for(int i=0;i<mScore.length;i++)
		{
			sum= sum+mScore[i];
		}
		double avg= sum/mScore.length;
System.out.println(sum);
System.out.println(avg+"%");
	}

}
