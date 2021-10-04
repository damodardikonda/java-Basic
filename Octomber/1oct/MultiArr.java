import java.util.*;

class MultiArr{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[][] a = new int[3][3];
        
            a[0][0] = sc.nextInt();
            a[0][1] = sc.nextInt();
            a[0][2] = sc.nextInt();

            a[1][0] = sc.nextInt();
            a[1][1] = sc.nextInt();
            a[1][2] = sc.nextInt();

            a[2][0] = sc.nextInt();
            a[2][1] = sc.nextInt();
            a[2][2] = sc.nextInt();

	

	for (int i = 0 ; i < 3; i++ ) {
	         	
	         	for (int j = 0 ; j < 3 ; j++ ) {
	         		
	         		System.out.print(a[i][j] + " ");
	         	}

	         	System.out.println();
		}
	}

}
