import java.util.Scanner;

class P3{

	public static void main(String[] args) {
		
          Scanner sc = new Scanner(System.in);

          System.out.println(" Enter Current ");
          int i = sc.nextInt();
	
          System.out.println(" Enter Resistance ");
          int r = sc.nextInt();
	
	      int v = i * r ;

	      System.out.println("Voltage  is " + v);
	}
}