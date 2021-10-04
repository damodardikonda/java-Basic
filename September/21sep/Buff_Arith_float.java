import java.io.*;

class Buffer_Arith_F{
	
	static public void main(String dams[]) throws IOException

  {
      BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

      float x = Float.parseFloat(br.readLine());

      String s = br.readLine();

      float y = Float.parseFloat(s);

 
     System.out.println(" Addition is = " + (x+y));
     System.out.println(" Subtraction is = " + (x-y));
     System.out.println(" Multiplication is = " + x*y);
     System.out.println(" Division is = " + x/y);
     
  }

}