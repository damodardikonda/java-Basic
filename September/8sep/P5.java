import java.util.Scanner;

class P5{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

          int n = sc.nextInt();
int temp =0 , sum = 0;
          for (int i = 2 ; i <= n ; i++ ) {
               temp = i;
                   for (int j = 1 ; j < i ; j++ ) {
                          
                          if(temp % j == 0){

                          	sum = sum + j;
                          }         	
          }	               
                            if(temp == sum ){

          	System.out.print(temp + " ");
          

                   }

          }


       	}
}