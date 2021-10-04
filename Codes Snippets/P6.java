import java.io.*;

class P6{

	public static void main(String[] args) throws IOException {
		
         BufferedReader br = new BufferedReader( new InputStreamReader ( System.in));

         String var1 = new String();

         var1 = var1+br.read();
         var1 = var1 +(char) br.read();

         System.out.println(var1);
	}
}