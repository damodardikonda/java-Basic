
import java.io.*;

class EvenOdd{
 
  public static void main(String[] args) {
  	int num = 0;
  	try{
     	BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
  	   num = Integer.parseInt( br.readLine());
     }catch( IOException e){

     	System.out.println("IOException Caught which is passed by FillINStackTrace()");
     }

     int rem = 0  , add = 0 , mul = 1 ;

     while(num!=0){

     	rem = num % 10;

     	if(rem % 2 == 0){

     		add = add + rem;
     	}
     	else{

     		mul = mul * rem;
     	}

     	num/=10;
     }
          
          System.out.println(" Sum of Even no " + add);
          System.out.println(" Mul of Odd no " + mul);
          
  }

}