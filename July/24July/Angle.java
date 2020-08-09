import java.util.Scanner;

class Angle{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int ang=sc.nextInt();

		if(ang <= 90 ){

			System.out.println("Acute Angle");

		}

		else if(ang == 90){

			System.out.println("Right Angle Triangle");

		}

		else{

			System.out.println("Obtuse Angle");

		}

	}
}