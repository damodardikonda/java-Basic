import java.io.*;

class IPL{

	public static void main(String[] args) throws IOException {

		 BufferedReader br = new BufferedReader(  new InputStreamReader(System.in));

         System.out.println("Enter overs");
		 int n = Integer.parseInt(br.readLine());
		 int tot_score=0;
		 int total_ball = n * 6 ;

		 int run [] = new int[total_ball];

         System.out.printf("Enter %d Balls" , total_ball);
		 for ( int i = 0 ; i < total_ball ; i++ ) {
		 	
		 	run[i] = Integer.parseInt( br.readLine());
		 	tot_score = tot_score + run[i];

		 	}

		 	int six  = 0 , four = 0 , other = 0;

		 	for (int i = 0 ; i < total_ball ; i++ ) {
		 		
		 		if(run[i] == 6)
		 			six++;
		 		else if ( run[i] == 4)
		 			four++;
		 		else 
		 			other++;

		 	}

		 	System.out.println("Total Score = " + tot_score);
		 	System.out.println("Total Number of Balls = " + total_ball);
		 	System.out.println("Total Six = " + six);
		 	System.out.println("Total Fours = " + four);
		 	System.out.println("Total number of Other(1,2,3,5) = " + other);
		 	

 
	}
}