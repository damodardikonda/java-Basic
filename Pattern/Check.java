import java.util.Scanner;

class Check{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Name");

		String name=sc.next();

		System.out.println("Enter the Age");

		int age=sc.nextInt();

		System.out.println("Enter the Mobile Number");

		int length=sc.nextInt();
		int mob_no[] = new int[length];

		int num=0;int count=0;


             if(name =="@" || name =="#" || name == "$" || name == "%" || name == "&" || name == "*"){
            	System.out.println(" Special Character not allowed");
            }

            if(age<0){

            	System.out.println("Negetive Age is not allowed");
            }

            if(mob_no !=10){

            	System.out.println("Mobile number should be 10 digit");
            	while(mob_no != 0){

            		num=mob_no%10;
            		count=count+1;

            		System.out.println("Count of number is "+count);


            	}
            }


	}
}