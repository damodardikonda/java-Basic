import java.io.*;


class Input1_str{

	public static void main(String[] args) throws IOException {
		
         InputStreamReader isr = new InputStreamReader(System.in);

         BufferedReader br = new BufferedReader(isr);

         String s = (String) br.read();

          System.out.println(s);

	}
}