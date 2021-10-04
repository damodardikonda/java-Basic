import java.util.Scanner;
class SP{

	public static void main(String[] args) {
		
		int a[] = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the Number ");

		for (int i = 0 ; i < a.length ; i++ ) {
			
			a[i] = sc .nextInt();
		}
int small =a[0];
         int post = 0;
		
		for (int i = 0 ; i < a.length ; i++ ) {
			
			if(a[i] < small){

				small = a[i];
                post = i;
			}
		}

         System.out.println(" Small is  " + small);
         System.out.println(" Small Position is  " + post);
         
	}
}