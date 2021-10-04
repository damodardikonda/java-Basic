import java.io.*;

 class P22{

      public static void main(String[] args) throws IOException {
      	
      	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
      	
      	int n = Integer.parseInt(br.readLine());

      	int sum = 0;

      	for (int i = 1 ; i < n-1 ; i++ ) {
      	
      	 
      	 
      	      	
      	      	if( n % i == 0 ){

      	      		sum = sum + i;
      	      	}

 

             
      	if(sum == i ){

      		System.out.print( "it is Perfect number ");
      	}

      	}

      }
 }