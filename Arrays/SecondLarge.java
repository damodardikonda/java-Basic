import java.util.Scanner;

class SL{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	 
	    int a[] = new int[5];
int i = 0 ;
	    for ( i = 0 ; i < a.length ; i++ ) {
	    	
	    	a[i] = sc.nextInt();
	    }

	    int large = a[0];

	    for ( i = 1; i < a.length ; i++ ) {
	    	
	    	if(large < a[i]){

	    		large = a[i]; 
	    	}

	    	int sl = a[1];

	    	int pos = 0;

	    	for ( i = 0 ; i < a.length ; i++ ) {
	    		
	    		if(a[i] != large){

	    			if(a[i] > sl ){

                          sl = a[i];

                          pos = i ;
	    			}
	    		}
	    	}

	    	System.out.println(" Second large is " + sl);

	    	System.out.println(" Second large Position is " + pos);
	    	
	    }

	}
}