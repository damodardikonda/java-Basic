import java.io.*;
class ArrPos{

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[6];

		for (int i = 0 ; i < 5 ; i++ ) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter thye Number ");
		int num = Integer.parseInt(br.readLine());

		System.out.println("Enter the Position");
		int pos = Integer.parseInt(br.readLine());

		for (int i = 4 ; i >= pos-1 ; i--) {
			
			arr[i+1] = arr[i];
		}

		arr[pos-1] = num;


		System.out.println("All Arr");

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			System.out.println(arr[i]);
		}
	}
}