import java.io.*;
class ArrSum{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader ( System.in ));
				

          int arr[] = new int[5];

          for (int i = 0 ; i < arr.length ; i++) {
          	
          	arr[i] =Integer.parseInt( br.readLine());
          }

          int sum =0;

          for (int i = 0 ; i < arr.length ; i++ ) {
          	
          	sum = sum + arr[i];
          }

          System.out.println(sum);
	}
}