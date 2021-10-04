import java.util.Scanner;

class P1{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
int ans= 0;
		for(int i = 0 ; i < 15 ; i++){

            ans = i * n + 1;
            System.out.print(ans + " ");

         }
	}
}