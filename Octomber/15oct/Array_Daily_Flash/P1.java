import java.util.*;
class P1{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter row");
        int row = sc.nextInt();

   		System.out.println("Enter column");
        int col = sc.nextInt();

       int len = row * col;

       int[][] num = new int[row][col];

       System.out.println("Length of array is = " + len );

       int count = 0 ;

       for (int i = 0 ; i < row  ; i++) {
       	
       	   for (int j = 0 ; j < col  ; j++ ) {
       	   	     System.out.print("Enter elements = ");
       	   	     num[i][j] = sc.nextInt();
                 count++; 
       	   }
       }


       System.out.println("Length is = " + count);
	}
}