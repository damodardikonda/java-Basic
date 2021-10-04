import java.util.*;
class DoAvg{

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0 , i=0 ;
		do{

			sum = sum + i;
			i++;
		}while(i<=n);	

		float avg = (float)sum;
		System.out.println(avg);
	}
}