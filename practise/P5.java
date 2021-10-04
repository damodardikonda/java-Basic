import java.util.Scanner;
class P5{

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int ft = 0 , sum = 0;
			int st = 1;
			int tt = 0;
				int c = 0;
			for (int  i = 0 ; i < n ; i++ ) {
				
				c++;
			}
				int arr[] =new int[c];
				int i = 0;
			while((tt < n)&&(i < arr.length)){

				tt = ft + st;	
				ft = st;
				st = tt;

				if(tt%2 == 0){

						arr[i] = tt;

						i++;
				}
			}

			if(tt == n){

				System.out.println( n + " is a Fibonacci number");
			}
			else{
						/*int count = 0;
						ft = 0; 
						st = 1;			
				for(int i = 1; i <= n; i++){
					
					
					int nt = ft + st;

					if(nt % 2 == 0)
						count = count+ nt;
					
					ft = st;
					st = nt;

					*/

					for (int j = 0 ; j < arr.length ; j++) {
						
						sum = sum + arr[j];
					}
				}
				System.out.println(sum);
			}					
				
			}
		
