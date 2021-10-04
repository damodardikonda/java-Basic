import java.util.Scanner;

class P4{
	
	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
           
           System.out.println("Enter Rows And Columns");
           int m = sc.nextInt();
        int n = sc.nextInt();

		 int num[][] = new int[m][n];
;

		 System.out.println("Enter values");
        for (int i = 0; i < m ; i++ ) {
         	
         	for (int j = 0 ; j < n ; j++ ) {
         		
                 num[i][j] = sc.nextInt();
         	}
         }
 
   
   for (int i = 0; i < m ; i++ ) {
            
            for (int j = 0 ; j < n ; j++ ) {
                
                 for( j = 0  ; j < 3 ; j++){

                    if(i == 1 && j == 0 || i == 1 && j == 2){
 
                        System.out.print(" ");

                         continue;
                    }
                    

                        System.out.print(num[i][j] + " ");
                    
                 }             

             }


             System.out.println();
     }
 
}
}