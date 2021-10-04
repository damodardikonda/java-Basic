import java.io.*;
import java.util.*;
class Str_Token{
	
	public static void main(String[] args) throws IOException{

       BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

         String  str = br.readLine();

         StringTokenizer st = new StringTokenizer(str , " ,");

         String token1 = st.nextToken().trim();

         char ch = (char) st.nextToken().charAt(0);
         br.skip(1);

         int age = Integer.parseInt(st.nextToken().trim());

         Double marks = Double.parseDouble(st.nextToken().trim());


         System.out.println(" Name is  =  " + token1 );
         System.out.println(" Grade is = " + ch);
         System.out.println(" Age is  =  " + age);
         System.out.println(" Marks is = " + marks);

}
}