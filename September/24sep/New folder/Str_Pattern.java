import java.util.*;

class P4{
	
    public static void main(String[] args) {
    	
    	String s1 = "Swaroop,A,2,324,2";
    	String s2 = "SONIA ,C,23,522.05 ";
 
        StringTokenizer st  = new StringTokenizer(s1 , " ,");
        StringTokenizer st2  = new StringTokenizer(s2 , " ,");
        
    	for (int i = 1 ;  st.hasMoreElements()  ; i++ ) {
    		
    		System.out.println(st.nextToken());
    	}

 System.out.println("***********************");
    	while(st2.hasMoreElements()){

    		System.out.println(st2.nextToken());
    	}
    }

}