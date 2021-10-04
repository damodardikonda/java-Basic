import java.util.*;

class P3{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0 ;
		float avg = 0 ;
		
		System.out.println(" Enter the length of students ");
		int x = sc.nextInt();

		int marks[]= new int[x];

		for (int i = 0 ; i < marks.length ; i++ ) {
			
			System.out.println("Enter the Marks of student");
			marks[i] = sc.nextInt();
			sum = sum +marks[i];
		}

         System.out.println("Total is " + sum);
        avg = sum /x;

        System.out.println("Average is " + avg);
	}
}