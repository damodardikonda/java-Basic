import java.io.*;

class P9{
	
	public static void main(String[] args) throws IOException {
		
         BufferedReader br = new BufferedReader( new InputStreamReader (System.in) );

         char var1 =(char) br.read();
         br.read();
         br.read();
         //br.skip(2);
         String var2 = br.readLine();

         System.out.println(var2 + var1);
	}
}