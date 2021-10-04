import java.util.Scanner;

class P2{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int a = num + 2;

		int b = num - 2;

		System.out.println("Second Predecessor : " + b);

		System.out.println("Second Successor : " + a);
	}
} 