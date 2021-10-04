import java.util.Scanner;
class digit{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


System.out.println("Enter n");

		int n = sc.nextInt();

		int a[] = new int[n];
         
         System.out.println(" Enter number");

		for (int i = 0 ; i < a.length;i++ ) {
			a[i]=sc.nextInt();
			System.out.println(" Enter at pos " + i + a[i]);
		}

		for (int i = a.length-1; i >=0 ; i--) {
			
			System.out.print(a[i]);
		}

	}
}