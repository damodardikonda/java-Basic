import java.io.*;

class Test{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));

		String s = br.readLine();
       
		for (int i = 0 ; i < s.length() ; i++ ) {
	 
	        char a  =  s.charAt(i);
            char aaa = 0;
           if( a >= 'A' && a <= 'Z'){
	        		int num = (int) a;
	        		int x = num - 65 ; 
            		int num2 = 90 - x;
		             aaa = ( char ) num2;
		            //System.out.println(aaa);
	    }
		
		else if( a >= 'a' && a <= 'z'){
	        		int num3 = (int) a;
	        		int xx = num3 - 97 ; 
            		int num4 = 122 - xx;
		            aaa = ( char ) num4;
		            //System.out.println(aaa);
	    }

          String ss = Character.toString(aaa);
          System.out.print(ss);
	 	}
	
	}
}