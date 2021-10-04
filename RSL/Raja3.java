import java.util.Scanner;
class Raja3{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int arr1[] = new int[n1];

		char arr2[] = new char[n2];

		for (int x = 0 ; x < n1 ; x++ ) {
				
				arr1[x] = sc.nextInt();	//1,2,3
		}
		System.out.println("Enter char");
		for (int x = 0 ; x < n2 ; x++ ) {
				
				arr2[x] = sc.next().charAt(0);//a,b,c	
		}
		int n3 = n1+n2;

		int arr3 [] = new int[n3];

		int i = 0;
		int j = 0;
		int k = 0;
		while((i < arr1.length) && (j < arr2.length)){
				arr3[k] = arr1[i];
				k++;
				arr3[k] = arr2[j];
				k++;
				i++;
				j++;
				
		}		
		for (int x = 0 ; x < n3 ; x++ ) {
				
			if((arr3[x] >= 97 && arr3[x] <=122) ||(arr3[x] >= 65 && arr3[x] <= 90))
				System.out.print((char)arr3[x]);
			else
				System.out.print(arr3[x]);

		}
	}
}