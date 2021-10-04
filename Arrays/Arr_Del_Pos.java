import java.util.Scanner;

class ADP{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		System.out.println(" Enter the length");
		int len = sc.nextInt();

       int a[] = new int[len+1];

       System.out.println(" Enter the Numbers ");

       for (int i = 0 ; i < len  ; i++ ) {
       	
       	  a[i] = sc.nextInt();
       }
 
       System.out.println(" Entered  Numbers are ");

       for (int i = 0 ; i < len  ; i++ ) {
       	
       	System.out.println(a[i] + " ");

       }

       System.out.println(" Enter the Number u want to delete ");

        int n = sc.nextInt();
   int pos = 0;

       for (int i = 0 ; i < len ; i++ ) {
       	
       	  if(a[i] == n){

               pos = i ;
       	  }
       }

       for (int i = pos ; i < len-1 ; i++ ) {
       	
       	      a[i] = a[i+1];
       }
 len--;
      System.out.println(" After delertion Entered  Numbers are ");

       for (int i = 0 ; i < len  ; i++ ) {
       	
       	System.out.println(a[i] + " ");

       }
 

	}
}