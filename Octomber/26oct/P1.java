import java.util.Scanner;
class P1{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
        
		StringBuffer sb = new StringBuffer(sc.next());
       
       for (int i = 0 ; i < sb.length() ; i++ ) {
       	
       	 char c = sb.charAt(i);

       	  if( i < 5){

       	  	System.out.print(c);
       	  }
       }
	}
}