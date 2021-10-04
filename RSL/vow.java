
import java.io.*;

class Vow{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char a = (char) br.read();

		if(a == 'a' || a=='e' || a=='i' || a=='o' ||a=='u'){

			System.out.println("vowel" + a);
		}
	}
}