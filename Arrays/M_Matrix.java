class M_Matrix{

	public static void main(String[] args) {
		
		int a[][] = new int[3][3];
	    int b[][] = new int[3][3];
	    int sum[][] = new int[3][3];
	
	     int n1=10,n2=5;

	     for (int i = 0 ; i < 3 ; i++ ) {
	     	
	     	for (int j = 0 ; j < 3 ; j++ ) {
	     		
	     		a[i][j] = n1;
	     		n1++;
	     	}
	     }

         
	     for (int i = 0 ; i < 3 ; i++ ) {
	     	
	     	for (int j = 0 ; j < 3 ; j++ ) {
	     		
	     		b[i][j] = n2;
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
	     		
	     		for(int k = 0 ; k <3 ; k++){

	     			     	 sum[i][j] = a[i][k] * b[k][j];
	     		
	     	}
           }
           System.out.println();
	     }

         

           System.out.println(" Multiplication of  Matrix is = ");
	     for (int i = 0 ; i < 3 ; i++ ) {
	     	
	     	for (int j = 0 ; j < 3 ; j++ ) {
	     		
	     	 System.out.print(sum[i][j] + " ");
	     		
	     	}
           
           System.out.println();
	     }

	}
}