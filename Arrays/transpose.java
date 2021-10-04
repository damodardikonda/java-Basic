import java.util.Scanner;

class Transpose{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a[][] = new int[3][3];

		int transpose_a[][] = new int[3][3];

		int i = 0,j=0;

		for (i = 0; i<3 ; i++ ) {
			
			for (j = 0; j < 3 ; j++ ) {
				
				a[i][j] = sc.nextInt();
			}
		}

		


		System.out.println("Entered Matrix are :=");
       
       for ( i = 0; i<3 ; i++ ) {
			
			for (j = 0; j < 3 ; j++ ) {
				
				System.out.print(a[i][j] + " ");
			}

            System.out.println();
			}

	    for (i=0; i<3 ; i++ ) {
			
			for (j=0; j < 3 ; j++ ) {
				
				transpose_a[j][i] = a[i][j] ;
			}

			System.out.println();
		}

		for (i=0; i<3 ; i++ ) {
			
			for (j=0; j < 3 ; j++ ) {
				
					System.out.print(transpose_a[i][j] + " ");
			}

			System.out.println();
		}



	}
}