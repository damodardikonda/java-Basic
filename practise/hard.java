/*

====================
java100
cpp65
python03


op:-

java          100
cpp           065
python        03
====================
*/

import java.util.Scannner;
class hard{

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	for (int i =0 ; i < 3 ; i++ ) {
		
	    String op ="";
		String s = sc.next();
        int count = 0 ;
        int sss=0;
        for(int j =0 ; j < 10 ; j++){

        	char aa = sc.next().charAt(i);
            count++;
            sss = count +9;
        	if((aa >='A' && aa <='Z') || (aa >='a' || aa <= 'z')){

        		op = String.Valueof(aa);
        	}else if (aa >= 0 && aa <= 9){
                
                for (int k = count-1 ; k < sss ; k++ ) {
                	
                	op = 
                }

        	}
        }
	}
}

}