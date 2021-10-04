import java.io.*;

class Perfect_No{

      public static void main(String[] args) throws IOException {
      	
      	BufferedReader br = new BufferedReader( new InputStreamReader (System.in));
      	int n = Integer.parseInt( br.readLine());
      	int sum = 0 ;

      	for (int i = 1 ; i < n ; i++ ) {
      		
      		if(n % i == 0){

      			sum = sum + i;
      		}
      	}

      		if(sum == n){

      			System.out.println( n + " is a perfect number ");

      		}else
      		System.out.println( n + " is not perfect number");
      	
      }
}