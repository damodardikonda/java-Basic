import java.io.*;

class P1{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

      System.out.println("Enter 1 for string  or 2 for Number");
		int str = Integer.parseInt( br.readLine());
  

        switch(str){

        	case 1:

        	      System.out.println("Enter string ");
        	      String s = br.readLine();
        	      System.out.println(s);
                  break;


        	case 2:

        	      System.out.println("Enter Integer ");
        	      int i  = Integer.parseInt(br.readLine());
        	      System.out.println(i);
                  break;
        }



	}
}