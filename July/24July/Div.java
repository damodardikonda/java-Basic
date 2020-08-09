import java.util.Scanner;

class Div{
	
	

		int divisible5(int x){

			if (x%5 == 0)

				System.out.println("Divisible By 5");

			else 
				System.out.println("Not divisible by 5");

			return 0;
		}

    public static void main(String args[]){

		Div d = new Div();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number");

		int n=sc.nextInt();

		d.divisible5(n);

	}

}