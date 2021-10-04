import java.util.*;
class Raja5{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum[] = new int[10];
		int res = 0;
		int ft = 0;
		int st = 1;
		int tt = 0 ;

		int i = 0 , j = 0;

		while(tt < n){

			tt = ft + st;
			if(tt % 2 == 0){
				sum[j]=tt;
				j++;}
			ft = st;
			st=tt;
		}
		if(tt == n)
			System.out.println( n + " is a fibonacci number ");
		else{

			for (int k = 0 ; k < sum.length-1 ; k++ ) {
				
				if(sum[k] % 2 == 0){

					System.out.println(sum[k]);
					res = res + sum[k];
				}
			}

			System.out.println( n + " is not a fibonacci number so output is " + res );
		}
	}
}