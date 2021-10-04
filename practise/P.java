import java.util.*;
class P{

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");

		Scanner sc = new Scanner(System.in);
		int num =  sc.nextInt();

		int temp = num , rem = 0,val = 0 ;

		while(num!= 0 ){

			rem = num % 10;
			val = (val*10) + rem;
			num /=10;
		}

		if(temp == val)
			System.out.println("Palindrom");
		else
			System.out.println("Not palindrom");
	}
}