import java.util.Scanner;

class Arr_Ins_Pos{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


       System.out.println("Eneter length");
	   int len = sc.nextInt();
          
          int a[] = new int[len+1];
        System.out.println("Enter " + len + "Element");

        for (int i = 0; i < len  ; i++ ) {
        	
        	a[i]= sc.nextInt();

        }

         System.out.println("Entered Element is : ");
        for ( int i = 0 ; i < len ; i++ ) {
        	
        	System.out.print( a[i] + " ");
        }

        System.out.println(" Entered Position");

        int pos = sc.nextInt();

        
        System.out.println(" Entered Number");
        int n = sc.nextInt();

        for(int i = len - 1 ; i >= pos ; i--){

        	a[i+1] = a[i];

        }

        a[pos] = n;
        len = len +1;

         System.out.println(" After Element is : ");
        for ( int i = 0 ; i <len ; i++ ) {
        	
        	System.out.print( a[i] + " ");
        }

	}
}