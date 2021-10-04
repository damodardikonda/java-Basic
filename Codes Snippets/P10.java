import java.io.*;

class P10{
	
	public static void main(String[] args) throws IOException {
		
         BufferedReader br = new BufferedReader( new InputStreamReader (System.in) );
          
          double var1 = Integer.parseInt(br.readLine());
          double var2 = Integer.parseInt(br.readLine());
 
         System.out.println(++var2 + var1++);
	}
}