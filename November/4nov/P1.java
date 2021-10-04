import java.io.*;
class P1{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader ( new  InputStreamReader (System.in));
		String s1 = br.readLine();

		int len = s1.length();
		char c ;
		char arr[] = new char[len];
        int i = len;
        int j = 0;
		for ( i = len-1 ; i >= 0 ; i--  ) {
			
            c = s1.charAt(i);
            arr[j] = c;
            j++;
		}

		   
		        
		  
        for (int k = 0 ; k <arr.length ; k++) {
        
               System.out.print( arr[k]);	
        }
		
	}
}