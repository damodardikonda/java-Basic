import java.util.Scanner;

class P2{
	
	public static void main(String[] args) {
		
		int num[][] = new int[3][];

		Scanner sc = new Scanner(System.in);

		int l1 = sc.nextInt();
		int l2 = sc.nextInt();
		int l3 = sc.nextInt();

		num[0] = new int[l1];
		num[1] = new int[l2];
		num[2] = new int[l3];
        int square = 0;
		for (int i = 0 ; i < num.length ; i++ ) {
		 	
		 	for (int j = 0 ; j < num[i].length ; j++ ) {
		 		
		 		System.out.print("Enter the number = ");
		 		int a =  sc.nextInt();
		 		square = a * a;
		 		num[i][j] =  square;
		 	}
		 } 

         System.out.println("Entered the number = ");
         for (int i = 0 ; i < num.length ; i++ ) {
		 	
		 	for (int j = 0 ; j < num[i].length ; j++ ) {
		 		

		 		System.out.print(num[i][j] +" ");
		 	}

		 	System.out.println();
		 } 


	}
}