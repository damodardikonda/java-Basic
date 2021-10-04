/*

pow = x * n

if n%2 = 0 
	x =x * n 
		n = n/2

if n % 2 = 1
	ans = ans * x
		n= n-1 

*/

class PowXN{

	public static void main(String[] args) {
		
		long x  = 2;
		int n = 10;
		long nn = n;
		long ans = 1;
		if(nn < 0) nn = -1 * nn;
		while(nn > 0){

			if(nn % 2 == 0){
				x = x * nn;
				nn/=2;
			}else if( nn % 2 == 1){

				ans = ans * x;
				nn = nn-1;
			}
		}

		if(n < 0 ) ans = 1 / ans;

		System.out.println(ans);
	}
}