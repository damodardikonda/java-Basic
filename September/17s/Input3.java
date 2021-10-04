
import java.io.*;

class Input3{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		System.out.println(str1);

		String str2 = br.readLine();
		System.out.println(str2);

        br.close();
        br.readLine();
	}
} 