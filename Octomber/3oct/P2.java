import java.util.*;
class P2{
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);

	System.out.println( " Enter the row"); 
    int row = sc.nextInt();
    int sum = 0 , large = 0;
    
	System.out.println( " Enter the columns"); 
    int col = sc.nextInt();

    int num[][] = new int[row][col];

    for (int i = 0 ; i < row  ; i++) {
    	
    	for ( int j = 0 ; j < col  ; j++ ) {
    		
    		num[i][j] = sc.nextInt();
    	}
    }

    for (int i = 0 ; i < row  ; i++) {
    	
    	for ( int j = 0 ; j < col  ; j++ ) {
    		
    		if(num[i][j] % 2 == 0){
    			 sum = sum + num[i][j]; 
    		}
    		large = num[0][0]; 
     	 if(large < num[i][j]){

     			large = num[i][j];
     		}

    	}
    }

       System.out.println("Sum is = " + sum);
       System.out.println("Max odd Element " + large);

       int output = sum * large;

       System.out.println("Output is " + output);
   }

}