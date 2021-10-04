import java.util.*;
class P2{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
        
        int count = 0;
		String s1 = sc.next();

        char ch ;

        for (int i = 0 ; i < s1.length(); i++) {
        	
        	ch = s1.charAt(i);
        	count ++;
        }

         System.out.println("length of String is = " + count);
	}
}