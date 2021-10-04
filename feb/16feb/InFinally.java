
import java.util.*;

class Trial{

int x = 12;
}
class IFTC{

	public static void main(String[] args) {
		
		try{

			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
		}
		catch(InputMismatchException e){

			System.out.println(" Input Miss match Caughted");
		}

		finally{

			try{

				System.out.println("Trying Null Pointer Exception");
			    Trial a = null;
			   System.out.println(a.x);
			}
			catch(NullPointerException ee){

				System.out.println("NullPointerException Caught");
			}
		}
	}
}