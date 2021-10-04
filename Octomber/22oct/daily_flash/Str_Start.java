import java.util.Scanner;
class Str_Start{
 
      boolean isStartWith(String s1 , String s2){

      	   int len = s2.length();
           char c ,d ;
           boolean match = true;

           for (int i = 0 ; i < len ; i++ ) {
           	
           	 c = s1.charAt(i);
           	 d = s2.charAt(i);

           	  if(c == d){
           	  	match = true;
           	  }

           	  else{
           	  	match = false;
           	  }
           }

           
           	return match;
      }
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 String");
        String s1 = new String(sc.next());
        String s2 = new String(sc.next());
        
        Str_Start ss = new Str_Start();
        if(ss.isStartWith(s1,s2)){

        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
	}
}