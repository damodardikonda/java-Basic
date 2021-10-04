import java.util.Scanner;

class P5{
	
	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
           
           System.out.println("Enter Rows And Columns");
           int m = sc.nextInt();
        int n = sc.nextInt();

		 int num[][] = new int[m][n];
         int num1[][] = new int[m][n];

		 System.out.println("Enter values");
        for (int i = 0; i < m ; i++ ) {
         	
         	for (int j = 0 ; j < n ; j++ ) {
         		
                 num[i][j] = sc.nextInt();
         	}
         }

          

        for (int i = 0; i < m ; i++ ) {
         	
         	for (int j = 0 ; j < n ; j++ ) {
         		
                 num1[i][j] = num[j][i];
         	}

         	System.out.println();
         }
        

        System.out.println("Transpose Matrix is = ");
         for (int i = 0; i < m ; i++ ) {
         	
         	for (int j = 0 ; j < n ; j++ ) {
         		
                 System.out.print(num1[i][j]+" "); 
         	}
         	System.out.println();
         }

	}
}