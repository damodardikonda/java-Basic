import java.util.Scanner;
class Sum{

	public static void main(String[] args) {
		
		int sum = 0 , rem = 0;

        Scanner sc = new Scanner ( System.in);
		int num = sc.nextInt();

		while(num != 0){
          
           rem = num % 10;
           sum = sum + rem;
           num = num / 10;
		}

		System.out.println(sum);
	}
}