import java.io.*;
class IPLTeam{

		String teamName ;
		String captain;
		String franchiseOwner;
		int jerseyNumber;

		IPLTeam( String teamName , String captain , String franchiseOwner , int jerseyNumber){

				this.teamName = teamName;
				this.captain = captain;
				this.franchiseOwner = franchiseOwner;
				this.jerseyNumber = jerseyNumber;
		}

		void teams(){

			System.out.println("Team Name is = " + teamName);
			System.out.println("Captain Name is = " +  captain);
			System.out.println("Franchise Owner = " + franchiseOwner);
			System.out.println("Jerseyt Number = " + jerseyNumber );
		}

			public static void main(String[] args) throws IOException {
		
			BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

		    System.out.println("Enter TeamName");
			String teamName = br.readLine();
	
			System.out.println("Enter Captain Name ");
			String captain = br.readLine();

			System.out.println("Enter FranchiseOwner");
			String franchiseOwner = br.readLine();

			System.out.println("Enter Jersy number");
			int jerseyNumber = Integer.parseInt(br.readLine());
	
			IPLTeam ipl = new IPLTeam(teamName , captain , franchiseOwner , jerseyNumber);
			ipl.teams();

	}
}