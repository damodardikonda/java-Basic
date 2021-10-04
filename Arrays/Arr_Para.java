import java.util.Scanner;
class Arr_Par{
Scanner sc = new Scanner(System.in);
 
void read_arr(int a[] , int n){

        System.out.println(" Enter the number " );

        //int len = n.length;
        for (int i = 0  ; i <= 4 ; i++ ) {
            
            a[i] = sc.nextInt();
        }
    }


    int small(int a[] , int n){

            int s = a[0];

        for (int i = 1 ; i <= 4 ; i++ ) {
            
              if(s > a[i])
                s = a[i];
        }

        return s;
    }

	public static void main(String[] args) {
		
		int a[] = new int[5];

		System.out.println(" Enter the Size of an array");

Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ABC ap = new ABC();
        ap.read_arr(a[] , n);

        int smallest = ap.small(a , n);

        System.out.println(" Smallest number is " + smallest);
	}
}