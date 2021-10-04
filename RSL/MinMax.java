import java.util.Scanner;

class MinMax{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in);

		int a[] = {3,2,6,1,9,6};
		int min = 0 , max = 0;
		int small = a[0];
		int big = a[0];
		for (int i = 0 ; i < a.length ; i++) {
			
			if(a[i] > big ){

				big = a[i];
				max = i;
			}else if(a[i] < small){

				small = a[i];
				min = i;
			}
		}

		System.out.println("Min Position = " + min);
		System.out.println("Max pos is "+max);
	}
}