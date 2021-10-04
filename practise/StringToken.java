import java.io.*;
import java.util.*;
class StrTokennn{

	public static void main(String[] args) throws IOException {
		
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in));

			System.out.println("Enter Employee Detail");

			String emp_Info =  br.readLine();

			StringTokenizer st = new StringTokenizer(emp_Info , ",");

			String name = st.nextToken().trim();

			int roll = Integer.parseInt(st.nextToken().trim());

			char grade =  st.nextToken().charAt(0);

			System.out.println(name);
			System.out.println(roll);
			System.out.println(grade);
			
	}
}