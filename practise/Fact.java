import java.io.*;

class Fact{

	public static void main(String[] args)  throws IOException{
		
          BufferedReader br = new BufferedReader( new InputStreamReader ( System.in));

          int num = Integer.parseInt(br.readLine());
          

          for ( int j = 1 ; j <= num ; j++) {
          
          int fact = 1;	
            for (int i = 1 ; i <= j ; i++ ) {
          	
          	fact = fact * i;
          }
          System.out.println("Fact " + j + " is  = "   + fact  );
	
        }
    }
}