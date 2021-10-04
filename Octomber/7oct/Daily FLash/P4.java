import java.util.*;

class P4{

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

        System.out.println("Number of books read by person 1 is = ");
        int b1 = sc.nextInt();
        System.out.println("Number of books read by person 2 is = ");
        int b2= sc.nextInt();
        System.out.println("Number of books read by person 3 is = ");
        int b3 = sc.nextInt();
        System.out.println("Number of books read by person 4 is = ");
        int b4 = sc.nextInt();


    	int people[][] = new int[4][];
        int sum = 0;
        people[0] = new int[b1];
        people[1] = new int[b2];
        people[2] = new int[b3];
        people[3] = new int[b4];


    	for (int i = 0 ; i < people.length ; i++ ) {
    		
    		for (int j = 0 ; j < people[i].length ; j++ ) {
 
                   System.out.print("Person" + i + "-" );
                   people[i][j] = sc.nextInt();
                }
                
            
      	}
    
            for (int i = 0 ; i < people.length ; i++ ) {
            
            for (int j = 0 ; j < people[i].length ; j++ ) {
 
                   System.out.print(people[i][j] );
                   sum = sum + people[i][j];
    
            }
                System.out.println("The number of boks read by " + i+ "Person is = " + sum);
                 System.out.println();
        }
    
    
    }
 

}