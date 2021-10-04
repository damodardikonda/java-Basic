
/*

	3.3 Explain the changes that would have to be made to the program of Code Fragment 3.8 so that it could perform the Caesar cipher for messages that are written
	in an alphabet-based language other than English, such as Greek, Russian, or
	Hebrew.

*/
import java.util.*;
class Ceasar_Cipher{

	String encoder(String inp , int rotate ){

		char encoderArr[] = inp.toCharArray();

		for (int i = 0 ; i < 26; i++ ) {
			
			encoderArr[i] =(char)('A' + (i + rotate)% 26);
		}

		String enc = new String(encoderArr);
		return enc;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter String for encoding");
		String inp = sc.next();

		System.out.println("Enter rotate");
		int rotate = sc.nextInt();

		Ceasar_Cipher c =new Ceasar_Cipher();
		String encoding_string = c.encoder(inp , rotate);


		System.out.println(encoding_string);

	}

}