class IPLPlayer{

     String pName = " KL Rahul";
     int ipl2020 =  479;
     static int totalRuns = 4789;

     void iplInfo(){

     	System.out.println("Player Name = " + pName);
     	System.out.println("IPL 2020 Runs = " + ipl2020);
     	System.out.println("Total Runs = " + totalRuns);
     }

	public static void main(String[] args) {
	
	     IPLPlayer ipl = new IPLPlayer();
	     ipl.iplInfo();


     	System.out.println("Player Name = " +ipl.pName);
     	System.out.println("IPL 2020 Runs = " + ipl.ipl2020);
     	System.out.println("Total Runs = " + ipl.totalRuns);

	}
}