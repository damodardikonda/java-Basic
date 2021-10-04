import java.util.Scanner;

class Student{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int stud[][] = new int[4][3];
        int max = 0 , pos=0;

		for (int i = 0 ; i < 4 ; i++ ) {
			 
			 System.out.println(" Enter marks of students");
			 for (int j = 0 ; j < 3  ; j++ ) {
			 	
			 	   stud[i][j] = sc.nextInt();

			 }}

			 for (int i = 0 ; i < 4  ; i++ ) {
			 	
			 	for (int j = 0 ; j < 3 ; j++ ) {
			 		
			 		System.out.print(stud[i][j] + " ");
			 	}

			 	System.out.println();
			 }



			 for (int j = 0 ; j < 3 ; j++ ) {
			 	
			 	for (int i = 0 ; i < 4 ; i++ ) {
			 		
			 		if(stud[i][j]>max)
			 		{
                        max = stud[i][j];
                        pos = i;
			 		}
			 	}

                   System.out.println(" Maximum marks is " + max + " obtained by " + pos);
			 }


		}
	}
