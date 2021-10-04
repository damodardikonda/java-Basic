import java.io.*;
import java.util.*;

class Token_Info{

	public static void main(String[] args) throws IOException{
		
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Enter Employyee Info");
        
        String emp_Info = br.readLine();

        StringTokenizer st = new StringTokenizer(emp_Info , ",");


        int token1 = Integer.parseInt( st.nextToken()).trim();

        String name = st.nextToken().trim();

        float sal = Float.parseFloat( st.nextToken().trim());

        System.out.println("Emp Id  = " + token1);

        System.out.println(" Emp Nmae = " + name); 

        System.out.println(" Emp salary = " + sal);

        
	}
}