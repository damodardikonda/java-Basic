import java.util.ArrayList;
import java.util.*;
class Ak{

	void replace(ArrayList<Integer>arr){

		for (int i = 0 ; i < arr.size() ; i++ ) {
			
			if(arr.get(i) == 0 )
				arr.set(i,9);
			else if(arr.get(i) == 1)
				arr.set(i,8);
			else if(arr.get(i) == 2)
				arr.set(i,7);
			else if(arr.get(i) == 3)
				arr.set(i,6);
			else if(arr.get(i) == 4)
				arr.set(i,5);
			else if(arr.get(i) == 5)
				arr.set(i,4);
			else if(arr.get(i) == 6)
				arr.set(i,3);
			else if(arr.get(i) == 7)
				arr.set(i,2);
			else if(arr.get(i) == 8)
				arr.set(i,1);
			else if(arr.get(i) == 9)
				arr.set(i,0);
		}

			for (int j = 0 ; j < arr.size() ; j++ ) {
				
				System.out.print(arr.get(j));
			}
}


	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if(num <= 0 || num >= 1000000 ){

			System.out.println("Wrong Output");
		}
		else{

			int rem = 0;
			int num2 = 0;		
			int i = 0;
			int rem2 = 0 ;
			while(num != 0){

				rem2 = num % 10;
				num2 = num2*10+rem2;
				num = num/10;
			}
			while(num2 != 0){

				rem=num2%10;

				arr.add(i , rem);

				i++;

				num2 = num2/ 10;
			}
		}
/*
		for (int k = 0 ; k < arr.size() ; k++) {
			
			System.out.println(arr.get(k));
		}
*/		Ak a = new Ak();
		a.replace(arr);
	}
}