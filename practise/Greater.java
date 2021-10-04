import java.io.*;

class Greater{

   float isGreat(float x,float y){

   	      if(x > y)
   	      	return x;
   	      else
   	      	return y;
   }
   public static void main(String[] args) throws IOException{
   	
           BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

           float a = Float.parseFloat(br.readLine());
           float b = Float.parseFloat( br.readLine());
           
           Greater gg = new Greater();
           float ans = gg.isGreat(a,b);

           System.out.println(ans);
   }
}