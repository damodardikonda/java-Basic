import java.io.*;


class P1{
	
	public static void main(String[] args) throws IOException{
		
     InputStreamReader isr = new InputStreamReader(System.in);

     BufferedReader br = new BufferedReader( isr );

     int n1 = Integer.parseInt(br.readLine());
     int n2 = Integer.parseInt(br.readLine());

     for (int i = n1 ; i <= n2 ; i++ ) {
     	
     	if(i % 2 == 1 ){

     		System.out.print(i + " ");
     	}
     }
	}
}