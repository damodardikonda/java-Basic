import java.util.Scanner;

class AIB{
	
	public static void main(String[] args) {
		
		int len = 8 ;
      
      Scanner sc = new Scanner(System.in);
      int a[] = new int[9];

      System.out.println(" Enter number ");
      for (int i = 0 ; i < len  ; i++ ) {
      	
      	a[i] = sc.nextInt();
      }

      System.out.println(" Enter number ");
      int n = sc.nextInt();
        int p = a[0];
      for (int i = len - 1 ; i >= p  ; i-- ) {
      	
      	a[i+1] = a[i];

      	      }
         
         a[p] = n ;
         len+=1;

           System.out.println(" Entered number is  ");
      for (int i = 0 ; i < len  ; i++ ) {
      	
      	System.out.print(a[i]+" ");
      }



			}


}                                                                                                    