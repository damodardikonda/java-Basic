import java.io.*;

class Divisible_By_5{

	public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader( new InputStreamReader ( System.in));

        int x = Integer.parseInt(br.readLine());

        int[] a = new int[x];

        for (int i = 0 ; i < x ; i++ ) {
        	
        	System.out.print("Enter the Numbers = ");
        	a[i] = Integer.parseInt(br.readLine());
        }


        System.out.println(" The numbers which is divisible by 5 are = " );

        for (int i = 0 ; i < x ; i++ ) {
        	
        	if(a[i] % 5 == 0)
        		System.out.println("Entered number " + a[i] +" is divisible by 5" );
        	else
        		System.out.println("Entered number " + a[i] +" is not  divisible by 5" );

        }
	}
}