
import java.io.*;

class ArrInput{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader ( System.in ));

		int arr[] = new int[10];
		int p = 0 , n = 0 , o = 0 , e = 0 ,z= 0;

		for (int  i = 0; i< arr.length ; i++ ) {
			
			arr[i] = Integer.parseInt(br.readLine());		}
	

			for (int i = 0 ; i < arr.length ; i++ ) {
				
				if(arr[i] > 0 ){

					p++;
				}

				else if(arr[i] < 0)
					n++;
				else if(arr[i] % 2== 0 && arr[i] > 0)
					e++;
				else if(arr[i] %2 ==1 && arr[i] >0 )
					o++;
				else if (arr[i] == 0)
					z++;
			}


			System.out.println("Positive Numbers are = " + p);

			System.out.println("Negetive Numbers are = " + n);

			System.out.println(" Odds Numbers are = " + o);

			System.out.println(" Even Numbers are = " + e);

			System.out.println(" Zero Numbers are = " + z); }

}