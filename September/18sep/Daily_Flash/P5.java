import java.io.*;

class P5{
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

	
      for (int j = start ; j <= end ; j++ ) {
      	
    	int fact = 1;
  
		for (int i = j ; i >= 1 ; i-- ) {
			
			 fact = fact * i ;
				}
       
                	 System.out.println(fact + " ");
                	 

       }
	}

}