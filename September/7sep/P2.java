
import java.util.Scanner;

class P2{
	
	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);

         int m = sc.nextInt();

         int v = sc.nextInt();

         float k = (float)1/2 * m *v*v;

         System.out.println("Input mass" + m);

           System.out.println("Input Velocity" + v);
	
	        System.out.println("Kinetic Energy " + k);
	
	}
}