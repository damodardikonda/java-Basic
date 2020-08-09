//import java.util.Scanner;

class Weekdays{

	public static void main(String[] args) {
		
	//	Scanner sc = new Scanner(System.in);
	//	int x = sc.nextInt();

     int x=4;

        System.out.println("Before Switch");

		switch(x){


			case 1:

			      System.out.println("Monday");
			      break;
		    
		    case 2:

			      System.out.println("Tuesday");
			      break;

			case 3:

			      System.out.println("Wednesday");
			      break;

			case 4:

			      System.out.println("Thursday");
			      break;

			case 5:

			      System.out.println("Fridey");
			      break;

			case 6:

			      System.out.println("Saturday");
			      break;

			case 7:

			      System.out.println("Sunday");
			      break;


			default:

			     System.out.println("Upto 7 only");
			     break;


		}

	        System.out.println("After Switch");

	}
}