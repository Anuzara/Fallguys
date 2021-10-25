package basic;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		int day;
		day = 1;
		switch (day) {
		case 1:
			System.out.println("Today is Monday");
			break;

		case 2:
			System.out.println("Today is Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Today is Wednesday");
			break;
		
		case 5:
			System.out.println("Today is Thrusday");
			break;
		case 6:
			System.out.println("Today is Friday");
			break;
			
			default:
				System.out.println("Not a Working Day");
	}
  String state;
  state=" ed";
  switch(state)
  {
  case "NY":
	  System.out.println("Welcome to Empire State");
	  break;
	  
  case "CT":
	  System.out.println("Welcome to Constitution State");
  break;
  case"NJ":
	  System.out.println("Welcome to GardenState");
	  break;
  default:
	  System.out.println("Not in Triboro ");
  }
  
  
}}
 