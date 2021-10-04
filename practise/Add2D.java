import java.util.*;

class Add2D{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the row and column of array :  ");
		int n = sc.nextInt();

		int arr1[][] = new int[n][n];
		int arr2[][] = new int[n][n];

		int add[][] = new int[n][n];


		Random rand = new Random();

		for (int i = 0 ; i < n ; i++ ) {
			
			for (int j = 0 ; j < n ; j++ ) {
				
				arr1[i][j] = rand.nextInt(10);
				arr2[i][j] = rand.nextInt(10);
			}
		}

		for (int i = 0 ; i < n ; i++) {
			
			for (int j = 0 ; j < n ; j++ ) {
				
				add[i][j] = 0;

				for (int k = 0 ; k < n ; k++ ) {
					
					add[i][j] = add[i][j] + arr1[i][k] * arr2[k][j];
				}
			}

			System.out.println();
		}


              System.out.println("Entered Multiplication of matrix are =");
            for (int i = 0 ; i < n ; i++ ) {
             	
             	for (int j = 0 ; j < n  ; j++ ) {
                                               	
             	System.out.print( add[i][j] + " ");
                          	
             	}

             	System.out.println();
             
             }


	}
}