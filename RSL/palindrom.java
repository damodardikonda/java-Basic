class Pal{

	public static void main(String[] args) {
		
/*		int n = 12321;
        int rem = 0 ;
        int sum = 0 ;
		int temp = n ;

		while(n > 0){
ju
            rem = n % 10 ;
            sum = (sum*10) + rem ;
            n = n/ 10; 
		}

		if(temp == sum ){

			System.out.println("Palindrom");
		}
*/

       for (int i = 1 ; i < 5 ; i++ ) {
       		 int fact = i ;
       		for (int j = i ; j>=1  ; j++ ) {
       			
       			fact = fact * j;
       		}

       		System.out.println("fact of " + i + " is " + fact)  ;     }

	}
}