import java.util.Scanner;

class P1{
	
	public static void main(String[] args) {
		
        System.out.println(" Enter ther length ");
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long num = 9 ;

		for (int i = 1 ; i <= n ;  i++) {
			
			System.out.print(num+" ");
			num=num*10+9;
		}


	}
}