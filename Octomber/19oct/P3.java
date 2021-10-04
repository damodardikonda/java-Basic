import java.util.Scanner;
class P3{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int sum = 0;

		for (int i = 0 ; i < num.length  ; i++ ) {
			
			num[i] = sc.nextInt();

			sum = sum + num[i];
		}

      System.out.println("The Sum is " + sum);



	}
}