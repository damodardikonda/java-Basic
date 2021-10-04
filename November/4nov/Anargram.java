import java.util.*;
class P3{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1= sc.next();
		String s2= sc.next();
        char c ,  d;
		int l1 = s1.length();
		int l2 = s2.length();
        boolean flag = true;
		if (l1 == l2)
			System.out.println("Anagram String");
		else
			System.out.println("Not an Anagram String");

		for (int i = 0 ; i < l1 ; i++ ) {
			c = s1.charAt(i).equalsIgnoreCase();
			for (int j = 0 ; j < l2 ; j++ ) {
			d = s2.charAt(j).equalsIgnoreCase();

			       if( c == d )	
			          	flag = true;
                    else {
                    	flag = false;
                    }
			}
		}

		if(flag == true ){
			System.out.println("Anagram String");
		}else
		System.out.println("Not anagram String");
	}
}