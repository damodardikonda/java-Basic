import java.io.*;

class P2{
	
      public static void main(String[] args) throws IOException {
      	
      	int cube = 0;
      	int s = 0 ;
      	   BufferedReader br = new BufferedReader( new InputStreamReader (System.in) );

      	   int n = Integer.parseInt(br.readLine());

      	   for (int i = 1  ; i <= n  ; i++ ) {
      	   	
      	   	if( i%2 == 1){

      	   		cube = i*i*i;
      	   		System.out.print(cube + " ");
      	   	}
      	   	else{

      	   		s = i*i;
      	   		System.out.print(s + " ");
      	   	}
      	   	
      	   }

      }
}