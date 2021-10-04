import java.util.*;

class FloatArr{
	
	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);

       int m = sc.nextInt();
       int n = sc.nextInt();

       float[][] arr = new float[m][n];

       for (int i = 0 ; i < m ; i++ ) {
       	
       	     for (int j = 0 ; j < n ; j++ ) {
       	     	
       	     	System.out.print("gandu values Enter kr ");
       	     	 arr[i][j] = sc.nextFloat()	;
       	     }

       	    }

       	    for (int i = 0 ; i < m ; i++ ) {
       	    	
       	    	for (int j = 0 ; j < n  ; ++j ) {
       	    		
       	    		System.out.print(arr[i][j] + " ");
       	    	}

       	    	System.out.println();
       	    }
	}
}