import java.io.*;
class Arr_mean{
	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr); 
         
         int sum = 0;

         int a[] = new int[5];

         for (int i = 0 ; i < a.length ; i++ ) {
         	
         	a[i] = Integer.parseInt(br.readLine());
         }

         for (int i = 0 ; i < a.length ;  i++) {
            
            System.out.print(a[i] + " ");
            sum = sum+ i ;

         }

int n = a.length;

int mean = sum / n;

System.out.println(" sum is  " + sum );

System.out.println(" Mean is  " + mean );
	}
}