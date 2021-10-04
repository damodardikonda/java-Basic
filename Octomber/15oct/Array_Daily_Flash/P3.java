import java.util.Scanner;

class P3{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num[] = new int[5];

		for (int i = 0 ; i < num.length ; i++) {
			
			num[i] = sc.nextInt();

		}

		int num1[] = new int[5];
		int c = 1;
		int found = 0;

		for (int i = 0 ; i < num1.length ; i++ ) {
			
			num1[i] = c;
			c++;
		}

		for (int i = 0 ; i < 5 ; i++ ) {
			
			if(num[i] != num1[i]){

				System.out.println(i+1);
                found = 1; 
			}

			if (found == 1) {
				
				break;
			}
		}


	}
}