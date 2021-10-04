import java.util.Scanner;
class P1{

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);

         System.out.println("enter the String");
         String s1 = sc.nextLine();

         char c1 = sc.next().charAt(0);

         char c2 = sc.next().charAt(0);
	    


	     s1 = s1.replace(c1,c2);

	     System.out.println(s1);
	}
}