import java.util.Scanner;

class Ins_Arr_End{
	
	public static void main(String[] args) {
		
           Scanner sc = new Scanner(System.in);

           int len = sc.nextInt();

           int a[] = new int[len+1];

            System.out.println("Enter " + len + " numbers");

           for (int i = 0 ; i < len  ; i++ ) {
           	 
           	       a[i] = sc.nextInt();
           }

           System.out.println(" Enter number which you want to insert");
           int num = sc.nextInt();

           a[len] = num;

           for (int i = 0;i < len+1 ; i++) {
           	
           	System.out.print(a[i] + " ");
           }
		}}