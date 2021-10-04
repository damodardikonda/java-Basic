import java.io.*;
import java.util.*;

class Str_Token_Loop{
	
        public static void main(String[] args)  throws IOException{
        	
            BufferedReader br = new BufferedReader( new InputStreamReader ( System.in));

            String str[] = new String[4];
            int i = 1;
            for ( ; i < 4 ; i++ ) {
                
                System.out.printf("Enter %d student = " , i);	
            	str[i] = br.readLine();
            


            StringTokenizer st = new StringTokenizer(str[i] , " ");

            String name = st.nextToken().trim();

            char grade = st.nextToken().charAt(0);

            int age = Integer.parseInt( st.nextToken().trim());

            double  marks = Double.parseDouble( st.nextToken().trim());

            System.out.println(" Name " + name);
            System.out.println(" grade = " + grade);
            System.out.println(" Age = " + age);
            System.out.println(" marks" + marks); 

        }
}

}