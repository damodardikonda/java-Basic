import java.util.*;

class P3{

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);

      System.out.println(" Enter rows and columns");
      int r = sc.nextInt();
      int c = sc.nextInt();
      
      int arr1[][] = new int[r][c];
      int arr2[][] = new int[r][c];
      int num[][] = new int[r][c];

      for (int i = 0 ; i < r ; i++ ) {
      	
      	for (int j = 0 ; j < c ; j++ ) {
       
               arr1[i][j] = sc.nextInt();		

      	}
      }

     for (int i = 0 ; i < r ; i++ ) {
      	
      	for (int j = 0 ; j < c ; j++ ) {
       
               arr2[i][j] = sc.nextInt();		

      	}
      }

      
     for (int i = 0 ; i < r ; i++ ) {
      	
      	for (int j = 0 ; j < c ; j++ ) {
       
               num[i][j] = arr1[i][j] + arr2[i][j];		

      	}
      }

       
     for (int i = 0 ; i < r ; i++ ) {
      	
      	for (int j = 0 ; j < c ; j++ ) {
       
            System.out.print(   num[i][j] + " ");		

      	}

      	System.out.println();
      }


	}
}