import java.io.*;
import java.util.*;

class Str_t_S{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

		String  str = br.readLine();

		StringTokenizer st = new StringTokenizer(str , " , ");

		String name = st.nextToken().trim();

		char  grade =(char) st.nextToken().charAt(0);
		

		int age =Integer.parseInt( st.nextToken().trim());

		float marks = Float.parseFloat(st.nextToken().trim());

		System.out.println(" Name is  = " + name);

		System.out.println("Grade is = " + grade);
		System.out.println(" Age is = " +age);
		System.out.println(" Marks  is = " + marks);
	}
}