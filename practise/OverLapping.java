import java.util.*;
class OverLapping{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of row : ");
        int r = sc.nextInt();

        System.out.println("Enter value of column : ");
        int c = sc.nextInt();

        int arr[][] = new int[r+1][c];

        for (int i = 0 ; i < r ; i++ ) {
             
             for (int j = 0 ; j < c ; j++ ) {
                 
                 System.out.print("Enter at row " + i + " and column " + j);
                 arr[i][j] = sc.nextInt();
             }
        } 
        int arr2[][] = new int[r][c];
        for (int i = 0 ; i < r ; i++ ) {
             
             for (int j = 0 ; j < c ; j++ ) {
                 
                System.out.print( arr[i][j] + " ");
             }

             System.out.println();
        } 
        System.out.println(" Sorting array : ");

        for (int i = 0 ; i < a.length ; i++ ) {
            
            for (int j = i ; j+i < a.length  ; j++ ) {
                
                if()
            }
        }

        System.out.println(" Array is : ");

        for (int i = 0 ; i < arr2.length ;  i++) {
            
            for (int j = 0 ; j < arr2.length ; j++ ) {
                
                System.out.print(arr2[i][j]);
            }

            System.out.println();
        }
    }
}