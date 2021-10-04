import java.io.*;

class Buffer_Arithmatic{
	
	static public void main(String dams[]) throws IOException

  {
      BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

      int x = Integer.parseInt(br.readLine());

      String s = br.readLine();

      int y = Integer.parseInt(s);

 
     System.out.println(" Addition is = " + (x+y));
     System.out.println(" Subtraction is = " + (x-y));
     System.out.println(" Multiplication is = " + x*y);
     System.out.println(" Division is = " + x/y);
     
  }

}