import java.util.Scanner;
class P3{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer(sc.next());

		int first = str.indexOf("e");

		int last = str.indexOf( "e" , first+1);

		System.out.println(" FIrst Occurance = " + first);
	    
		System.out.println(" last Occurance = " + last);
	}
}