import java.util.Scanner;
class P2{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");

		StringBuffer sb = new StringBuffer(sc.next());

		int index = sc.nextInt();

        if(index < sb.length()){
		for (int i = index ; i < sb.length() ; i++ ) {
		 	
		 	char c = sb.charAt(i);

		 	if(c >= 'A' && c <= 'Z'){

		 		c = (char)(c + 32);
		 		
		 	}

		   else	if(c >= 'a' && c <= 'z'){

		 		c = (char)(c - 32);
		 		
		 	}

		 	System.out.print(c);
		 } 

		}

		else{

			System.out.println("Invalid Index");
		}
	}
}