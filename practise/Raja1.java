import java.util.Scanner;
class Raja1{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		System.out.println("Enter the String");
		String s = sc.nextLine();
		int count = 0;
		int i = 0;
		int mid = s.length() /2;
		int j = mid;
		while((i < mid) || ( j < s.length())){

			char x = s.charAt(i);
			char y = s.charAt(j);

			if(x == y)
				count++;

			i++;
			j++;
		}		

		if(count == mid){

			System.out.println("True");
		}	
		else{

			System.out.println("False");
		}
		}
	}
