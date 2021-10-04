import java.io.*;

class P2{

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);
  
        br.skip(3);

        String str = br.readLine();

        System.out.println(str);

    }
 }