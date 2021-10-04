import java.util.*;

class P4{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num[][] = new int[3][];

		num[0] = new int [3];
		num[1] = new int[2];
		num[2] = new int [5];


		for (int i = 0  ; i < num.length ; i++ ) {
		 	
		 	for (int j = 0  ; j < num[i].length ; j++ ) {
		 		
		 		System.out.print("Enter elements");
		 		num[i][j] = sc.nextInt();
		 	}
		 } 



		for (int i = 0  ; i < num.length ; i++ ) {
		 	
		 	for (int j = 0  ; j < num[i].length ; j++ ) {
		 		if (num[i][j]  % 2 ==0) 
		 		System.out.print(num[i][j] + " ");
		 		
		 	}

		 	System.out.println();
		 } 
	}
}
