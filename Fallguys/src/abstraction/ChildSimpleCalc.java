package abstraction;

public class ChildSimpleCalc extends SimpleCalc {

	public static void main(String[] args) {
		ChildSimpleCalc csc= new ChildSimpleCalc();
		csc.add(100, 100);

	}

	@Override
	void add(double x, double y) {
	double sum= x+y;
	System.out.println(sum);
	}

}
