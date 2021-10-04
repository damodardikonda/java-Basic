import java.io.*;
class IPLArray{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BUfferedReader( new InputStreamReader ( System.in));

		System.out.println(" Enter total balls");
		int balls = Integer.parseInt(br.readLine());

		int arr[] = new int[balls];

		System.out.printf(" Enter %d Balls" + ball);
		int six = 0 , four = 0 , other = 0 , total = 0 ;
		for (int i = 0 ; i < arr.length ; i++ ) {
			
			if(arr[i] == 6)
				six++;
			else if(arr[i] == 4)
				four++;
			else
				other++;

			total += total;
		}

		System.out.println("Six = " + six);

		System.out.println("Four = " + four);

		System.out.println("Other = " + other);

		System.out.println("Total = " + totalotal);
	}
}