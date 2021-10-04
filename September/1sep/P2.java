import java.util.Scanner;

class P2{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
       
       System.out.println(" Before Swap " + a + " " + b);


		int temp = a;
		a= b;
		b=temp;

		System.out.println(" After Swap " + a + " " + b);
	}
}