class S_Matrix{

	public static void main(String[] args) {
		
		int a[][] = new int[3][3];
	    int b[][] = new int[3][3];
	    int sum[][] = new int[3][3];
	
	     int n1=5,n2=10;

	     for (int i = 0 ; i < 3 ; i++ ) {
	     	
	     	for (int j = 0 ; j < 3 ; j++ ) {
	     		
	     		a[i][j] = 5*n1+1;
	     		n1++;
	     	}
	     }

         
	     for (int i = 0 ; i < 3 ; i++ ) {
	     	
	     	for (int j = 0 ; j < 3 ; j++ ) {
	     		
	     		b[i][j] = 5*n2+1;
	     		n2++;
	     	}
	     }
        
        System.out.println(" 1st Matrix is = ");
	     for (int i = 0 ; i < 3 ; i++ ) {
	     	
	     	for (int j = 0 ; j < 3 ; j++ ) {
	     		
	     		System.out.print(a[i][j] + " ");
	     		
	     	}
           
           System.out.println();
	     }

       System.out.println(" 2st Matrix is = ");
	     for (int i = 0 ; i < 3 ; i++ ) {
	     	
	     	for (int j = 0 ; j < 3 ; j++ ) {
	     		
	     		System.out.print(b[i][j] + " ");
	     		
	     	}
           
           System.out.println();
	     }
 
           
	     for (int i = 0 ; i < 3 ; i++ ) {
	     	
	     	for (int j = 0 ; j < 3 ; j++ ) {
	     		
	     	 sum[i][j] = a[i][j] + b[i][j];
	     		
	     	}
           
           System.out.println();
	     }

         

           System.out.println(" Addition of  Matrix is = ");
	     for (int i = 0 ; i < 3 ; i++ ) {
	     	
	     	for (int j = 0 ; j < 3 ; j++ ) {
	     		
	     	 System.out.print(sum[i][j] + " ");
	     		
	     	}
           
           System.out.println();
	     }

	}
}