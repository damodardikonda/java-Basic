import java.util.*;
class Str_Low_Up{

    static void toUpper(String s1){
              int l = s1.length();
              char c[] = new char[l] ;
		    for (int i = 0 ; i < s1.length() ; i++ ) {
		    		
		    		char ch = s1.charAt(i);

                    c[i] = (char)(ch + 32); 
		    	}	

                for (int i = 0 ; i < s1.length() ; i++ ) {
                

		    	System.out.print(c[i]);	
                }

                System.out.print(" ");
		}

     void toLower(String s2){

          int l2 = s2.length();
              char cc[] = new char[l2] ;
		    for (int i = 0 ; i < s2.length() ; i++ ) {
		    		
		    		char chh = s2.charAt(i);

                    cc[i] = (char)(chh - 32); 
		    	}	


                for (int i = 0 ; i < s2.length() ; i++ ) {
                

		    	System.out.print(cc[i]);	
                }		
     }
	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);

		String s1 = sc.next();

		String s2 = sc.next();

		toUpper(s1);

        Str_Low_Up ss = new Str_Low_Up();
		ss.toLower(s2);

	}
}