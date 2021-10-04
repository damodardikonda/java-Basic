import java.io.*;

class P8{
	
	public static void main(String[] args) throws IOException {
		
         BufferedReader br = new BufferedReader( new InputStreamReader (System.in) );

         char var1 =(char) br.read();
         String var2 = br.readLine();

         System.out.println(var1 + var2);
	}
}