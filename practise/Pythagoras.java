import java.util.*;

class Pythagoras{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter angle 1");
		int a = sc.nextInt();

		System.out.println("Enter angle 2");
		int b = sc.nextInt();

		System.out.println("Enter angle 3");
		int c = sc.nextInt();

		int sum = (a*a)+(b*b);
		int sum2 = c*c;

		if(sum == sum2)
			System.out.println("Pythagoras Theoram prooved");
		else
			System.out.println("Not a Pythagoras Theoram");

	}
}