import java.io.*;
class P3{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

		String s1 = br.readLine();

		String s2 = br.readLine();

        char c1 = br.readLine().charAt(0);
		

		char c2 = br.readLine().charAt(0);

		System.out.println(s1.indexOf(c1));
		System.out.println(s2.lastIndexOf(c2));


	}
}