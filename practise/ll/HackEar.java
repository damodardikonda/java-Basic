import java.util.*;

class HackEar{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];

		for (int i = 0 ; i < a.length ; i++) {
			
			a[i] = sc.nextInt();
		}

int sum = 0;

		for (int i = 0 ; i < a.length ; i++ ) {
			
			for (int j = i ; j < a.length ; j++ ) {
			
			     if((a[j] > a[i] && a[j] % a[i] == 0))
			        sum = sum+ a[i];	
			}
		}

		System.out.println((sum));
	}
}