/*

2. Write a program in java for class IPL that contains:
1. Team name
2. Captain name
3. Best win percentage
4. Number of Indian batsmen
5. Number of International batsmen
Take input forabove fields using BufferedReader class and display them as follows:

*/
import java.io.*;

class IPL{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader ( System.in ));

		System.out.println("Enter the Team name");
		String teamName = br.readLine();

		System.out.println("Enter the Captain name");
		String captainName = br.readLine();
		
		System.out.println("Best win % ");
		float winPercent = Float.parseFloat(br.readLine());

		System.out.println("Enter the Indian Batsman Count");
		int batsman = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the International Batsman count");
		int batsmanName = Integer.parseInt(br.readLine());
		
		System.out.println("The Team Name is : " + teamName);
		System.out.println("The Captain Name is : " + captainName);
		System.out.println("Best Win % : " + winPercent);
		System.out.println("Batsman is : "+ batsman);
		System.out.println("International Batsman count : " + batsmanName);
		

	}
}