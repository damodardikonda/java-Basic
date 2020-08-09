import java.util.Scanner;

class Palindrom{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number or string");

		int num = sc.nextInt();

		int temp = num;
		int number=0;
		int last;

		while(num !=0){

			last=num%10;
			number = (number*10)+last;
			num=num/10;
		}

            if(temp == number){

            	System.out.println("Number is Palindrom");
            }
            else{

            	System.out.println("Number is not a Palindrom");

            }
	}
}