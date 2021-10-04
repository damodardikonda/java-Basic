import java.util.Scanner;
class P3{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		StringBuffer sb = new StringBuffer(sc.next());
		StringBuffer sb2 = new StringBuffer(sc.next());
        StringBuffer sb3 = new StringBuffer();
       int max;

       if(sb.length() > sb2.length())

       	     max = sb.length();
       	 else
       	 	max = sb2.length();

      
          for (int i = 0 ; i < max  ; i++ ) {
          	
          	   char c , d;

          	   if(sb.length() >  i ){

          	   	c = sb.charAt(i);
                sb3.append(c);
          	   }


          	   if(sb2.length() >  i ){

          	   	d = sb2.charAt(i);
                sb3.append(d);          	   	
          	   }

          }

          System.out.println(sb3);
    }

  }