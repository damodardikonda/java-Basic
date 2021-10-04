import java.util.*;

class P3{

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

    	int num[][] = new int[3][];
        
        num[0] = new int[2];
        num[1] = new int[6];
        num[2] = new int[2];
        int a = 10;
        int cube = 0 ;

        while(a!=0){
    	for (int i = 0 ; i < num.length ; i++ ) {
    		
    		for (int j = 0 ; j < num[i].length ; j++ ) {
    			
                      cube = a*a*a;
                      System.out.print(cube + " ");
                      a--;
    		}

    		System.out.println();
    	}
    }
    }

}