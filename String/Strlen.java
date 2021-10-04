import java.util.Scanner;

class Strlen_Pre{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter New String");

	    String str = sc.next();

	    int len = 0 ;


	    char ch[] = str.toCharArray();

	    int i = 1;

	    for (; i < ch.length ; i++ ) {
	    	
	    	len = i+1 ;
	    }

	    System.out.println("Length of String is " + len);


	}
}