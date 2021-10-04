import java.util.*;
class P5{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int num[] = new int[size];

         for (int i = 0 ; i < num.length ; i++ ) {
         	
         	num[i] = sc.nextInt();
         }
		static boolean checkMonotonic(int[] num ){
 
            for (int i =0  ; i < num.length ; i++ ) {
            	
            	for (int j = 1 ; j < num.length ; j++ ) {
            		
            		    if(i <= j && num[i] <= num[j]){

            		    	return true;
            		    }

            		    else
            		     return false;
            	}

            }

		} 
           int start = 0 ;
           int end = num.length;
		 static boolean ans = checkMonotonic( num );

		if( ans == true){
              
              System.out.println("MonoTonic");
		} 
		else{

			System.out.println(" it is not Monotonic");
		}
	}
}