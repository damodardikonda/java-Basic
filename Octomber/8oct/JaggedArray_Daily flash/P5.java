import java.util.*;

class P5{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num[][] = new int[3][];

		num[0] = new int [3];
		num[1] = new int[2];
		num[2] = new int [5];
        int sum = 0;

		for (int i = 0  ; i < num.length ; i++ ) {
		 	
		 	for (int j = 0  ; j < num[i].length ; j++ ) {
		 		
		 		System.out.print("Enter elements");
		 		num[i][j] = sc.nextInt();
		 	}
		 } 



		for (int i = 0  ; i < num.length ; i++ ) {
		 	
		 	for (int j = 0  ; j < num[i].length ; j++ ) {
		 		if (num[i][j]  % 5 ==0){ 
		 		
		 		       sum = sum + num[i][j];
		 		}
		 	}

		 	System.out.println();
		 } 


		 System.out.println("Sum is  =  " + sum);
	}
}
