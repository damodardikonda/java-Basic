import java.io.*;

class P3{

	public static void main(String[] args) throws IOException {
		
       BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

       int n = Integer.parseInt(br.readLine());

       int s = Integer.parseInt(br.readLine());

       int ans = 1;
       for (int i = 1 ; i <= n ; i++ ) {
       	 
       	  
       	  System.out.print(ans + " ");
          ans = ans+ s;
       }
	}
}