import java.io.*;

class IPLteam{

	String teamName;
	String captain;
	String franchiseOwner;
	int jerseyNumber;
	int countOfTrophiesWon;  

	IPLteam( String teamName , String captain , String franchiseOwner, int countOfTrophiesWon,int jerseyNumber ){

		this.teamName = teamName;
		this.captain = captain;
		this.franchiseOwner = franchiseOwner;
		this.jerseyNumber = jerseyNumber;
		this.countOfTrophiesWon = countOfTrophiesWon;
	}


	void display(){

		System.out.println("Team Nmae is =  " + this.teamName );
		System.out.println("Captain Nmae is =  " + this.captain );
		System.out.println("Franchise Owner Name is =  " + this.franchiseOwner );
		System.out.println("Jersy Number is =  " + this.jerseyNumber );
		System.out.println("Count Of Trophies Won is =  " + this.countOfTrophiesWon );
	}
	
	public static void main(String[] args) throws IOException{
		
          BufferedReader br = new BufferedReader( new InputStreamReader (System.in) );

          System.out.println("Enter Team Name");
          String teamName=br.readLine();

          System.out.println("Enter Captain Name");
          String captain=br.readLine();
 
           System.out.println("Enter FranchiseOwner Name");
          String franchiseOwner=br.readLine();

          System.out.println("Enter jerseyNumber");
          int jerseyNumber = Integer.parseInt(br.readLine());

          System.out.println("Enter count Of Trophies Won");
          int countOfTrophiesWon= Integer.parseInt(br.readLine());
         

         IPLteam i = new IPLteam(teamName,captain,franchiseOwner,jerseyNumber,countOfTrophiesWon);
         i.display();
	}
}