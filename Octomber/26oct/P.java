import java.util.Scanner;
class P5{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		StringBuffer sb1 = new StringBuffer(sc.next());
        
		StringBuffer sb2 = new StringBuffer(sc.next());

		sb1.append(sb2);

		System.out.println(sb1);

		System.out.println( sb1.lastIndexOf("we"));
	}
}