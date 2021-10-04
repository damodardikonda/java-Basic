import java.io.*;

class P4{
	
	public static void main(String[] args) throws IOException {
		
           BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

           int len = 2;
           int area = len*len;
           int perimeter = len*len*len;

           System.out.println("Length of side : " + len);
           System.out.println(" Area : " + area);
           System.out.println("perimeter is " + perimeter);
	}
}