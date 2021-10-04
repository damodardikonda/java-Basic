import java.util.Scanner;
class Count{

 public static void main(String[] args) {
 	
 	Scanner sc = new Scanner(System.in);

 	int num = sc.nextInt();

 	int rem =0 , count =0 ,add =0 ;

 	while(num !=0){

 		rem = num %10;
 		
 		count = count +1;
        num/=10;
 	}

 	System.out.println(" Count is = " + count);
   }

}