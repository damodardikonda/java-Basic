import java.io.*;
import  java.util.Arrays;
class ArrSort{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		System.out.println("Enter the Size of array");
		int n = Integer.parseInt(br.readLine());
        
        int arr[] = new int[n];

        for (int i = 0 ; i < arr.length ; i++ ) {
        	
        	arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

	}
}

