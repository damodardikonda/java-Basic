import java.util.Scanner;

class P5{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int max = 0; 
      int big = 0 ;
      if(n1 > n2){
      	big = n1;
      }
      else
      	big = n2;


      for (int i = 1; i < big ; i++ ) {
      	
      	   if(n1 % i == 0 && n2 % i == 0){
               
               max = i ;

      	   }
             
            }

      	   System.out.println(" The GCD of " + n1 + " and " + n2 + " is   = " + max);
      

      }

}