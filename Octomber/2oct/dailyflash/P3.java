import java.util.*;

class P3{
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
   
        int m = sc.nextInt();
        int n = sc.nextInt();
        int add_row = 0 ;
        int arr[][] = new int[m][n];
        int arr1[][] = new int[m][n];
        System.out.println("Enter values");
        for (int i = 0; i < m ; i++ ) {
         	
         	for (int j = 0 ; j < n ; j++ ) {
         		
                 arr[i][j] = sc.nextInt();
         	}
         }

         

        for (int i = 0; i < m ; i++ ) {
         	
         	for (int j = 0 ; j < n ; j++ ) {
         		
                 System.out.print(arr[i][j]+" "); 
         	}
         	System.out.println();
         }


        
        for (int i = 0; i < m ; i++ ) {
         	
         	int add_col= 0;
         	for (int j = 0  ; j < n ; j++ ) {
         	   
                 add_col = add_col + arr[i][j]; 
         	}

                if(add_col != 0)
         System.out.println("addition of coluimn is = " + add_row);
            System.out.println();         
    

         }
        
          
          for (int i = 0; i < m ; i++ ) {
            
            for (int j = 0 ; j < n ; j++ ) {
                
                 arr1[i][j] = arr[j][i]; 
                 }
         }

              
        for (int i = 0; i < m ; i++ ) {
            
                    for (int j = 0  ; j < n ; j++ ) {
               
                 add_row = add_row + arr1[i][j]; 
            }
            if(add_row != 0)
            System.out.println("addition of row is =" + add_row);
            System.out.println();         
       }

        
	}
}