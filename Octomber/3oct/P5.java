import java.util.*;

class P5.0.0.0.0

{
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

       System.out.println(" Enter Rows ");
        int row = sc.nextInt();

        int num[] = new int[10];
       
        for (int i = 0 ; i < row ; i++) {
            System.out.print("Enter Elements = ");  	
         	num[i] = sc.nextInt();
         } 

    System.out.println(" in reverse order");

    for (int i = row-1 ; i >= 0 ; i-- ) {
        
        System.out.print(num[i] + " ");
    }

}

}