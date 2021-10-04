import java.util.Scanner;
class Replace{

    static void strReplace(StringBuffer sb , char c1 , char c2 ){
        
    		char ss[] = new char[sb.length()];
        char ch ;
    	for (int i = 0 ; i < sb.length() ; i++) {
    		
    		ch = sb.charAt(i);

    		if(ch == c1){

    			ch = c2;
    		}

    		ss[i] = ch;

    	}
        
        for(int i = 0 ; i < sb.length() ; i++)
    	System.out.print( ss[i]);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(sc.next());

		char c1 = sc.next().charAt(0);
	    char c2 = sc.next().charAt(0);

	    strReplace(sb , c1,c2);

	 }
}