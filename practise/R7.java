import java.util.Scanner;
class R7{

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];

		int total =0;
		for (int i = 0 ; i < num.length ; i++ ) {
			
			num[i] = sc.nextInt();
		}
		int flag = 0;
		for (int i = 0 ; i < num.length ; i++ ) {
			
			for (int j = num[i] -1; j >= 2 ; j-- ) {
				
				
				if(num[i] % num[j] == 0){
					flag++;
					break;
				}else
				{
					total = total + num[i];

				}

			}
		}

		if(flag == 1)
			System.out.println("0");
		else
			System.out.println(total +1 );

	}
}