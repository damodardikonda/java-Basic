import java.util.*;

class P5{
	
	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
         
         int p = 0 , n = 0 , o = 0 ;
         int e = 0 , z =0; 
         int x = sc.nextInt();
         int num[] = new int[x];
 

         for (int i = 0 ; i < x ; i++ ) {

         	System.out.println("Enter numbers");
         	num[i] = sc.nextInt();
         
         }

         System.out.println("ENtered Number is ");

         for (int i = 0 ; i < x ; i++ ) {
         	

         	if(num[i] > 0){
               
               p++;
         	}
         	else if ( num[i] < 0){
         		n++;
         	}
         	else if (num[i] == 0){
         		z++;
         	}
         	else if( num[i]>0 && num[i] % 2 == 0 ){
         		e++;
         	}
         	else if( num[i] > 0 && num[i] % 2 == 1 ){
         		o++;
         	}
         }

         System.out.println("Number of positive number's is " + p);

         System.out.println("Number of negetive number's is " + n);

         System.out.println("Number of zero  is " + z);

         System.out.println("Number of Even number's is " + e);

         System.out.println("Number of odd number's is " + o);
	}
}`