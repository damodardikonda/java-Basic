import java.util.Scanner;

class Append{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

int i = 0 , j = 0 ;
       System.out.println("Enter 1 st number");
		String s1 = sc.next();

		System.out.println("Entyer 2nd Number");
		String s2 = sc.next();

		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();

		int len1 = ch1.length;
		int len2 = ch2.length;


		if(len1 > len2){

			for (i= 0;  i < len1; ) 
				
				i++;

				

				while( j < len2 ){

					ch1[i] = ch2[j];
					i++;
					j++;
				}
			}
		


		for ( i = 0 ; i < 10 ; i++ ) {
			
			System.out.print(ch1[i] + " ");
		}
	}
	}