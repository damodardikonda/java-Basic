import java.util.*;
class P4{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = new String(sc.next());

		String str2 = new String(sc.next());
	
         str1 = str1.toUpperCase();
        str2 = str2.toLowerCase();

        System.out.println(str1+" "+str2);
	}
}