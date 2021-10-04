import java.io.*;
class P1{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));

		String s1 = br.readLine();

		System.out.println("Enter the Character 1");
		char ch = br.readLine().charAt(0);
	
      
		System.out.println("Enter the Character 1");
		char ch2 = br.readLine().charAt(0);

	
		s1 = s1.replace(ch,ch2);
			System.out.println("Entered String is = " + s1);
	}

}