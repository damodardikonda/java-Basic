import java.util.*;
class P4{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements");
        int ele = sc.nextInt();

		int num[] = {10,35,22,7,6};

		for ( int i = 0 ; i < num.length ;  i++) {
			
			if(ele == num[i]){

				System.out.println("Position = "+i);
			}

		}
	}
}