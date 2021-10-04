import java.util.*;

class P5{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
         

        System.out.println("Number of marks by student 1 is = ");
        int b1 = sc.nextInt();
        System.out.println("Number of marks by student 2 is = ");
        int b2= sc.nextInt();
        System.out.println("Number of marks by student 3 is = ");
        int b3 = sc.nextInt();
        
		int student[][] = new int[3][];

		student[0] = new int[b1];
        student[1] = new int[b2];
        student[2] = new int[b3];

        	for (int i = 0 ; i < student.length ; i++ ) {
    		
    		for (int j = 0 ; j < student[i].length ; j++ ) {
 
                    student[i][j] = sc.nextInt();
                }
                
            
      	}
    
        int sum =0 , avg =0;
          for (int i = 0 ; i < student.length ; i++ ) {
               int a= 0;    
            for (int j = 0 ; j < student[i].length ; j++ ) {
 
                   System.out.print(student[i][j] );
                   sum = sum + student[i][j];
                 a++;
            }
             avg = sum /a;
            System.out.println("Average of Student " + i + "is : " + avg);
	}
}
}