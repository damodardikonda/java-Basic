class Cricket{
	static int runs=17266;
	int ODI_runs= 10773;

	void dispOdi(){
		System.out.println("The ODI Runs Of Dhonii is = "+ODI_runs);
	}


	static void dispRuns(){
		System.out.println("The Total Runs Of Dhonii is  = "+runs);
	}

}



class ShowRoom{

	static int cars =12;
	int bikes= 22;

	void dispBikes(){
		System.out.println("  Dhonii bikes = "+bikes);
	}


	 static void dispCars(){
		System.out.println("Dhonii Cars  = "+cars);
	}


}

class MSDhoni{

           public static void main(String[] args) {


             Cricket cool = new Cricket();
             cool.ODI_runs=10873;
             cool.dispOdi();
             cool.dispRuns();

             Cricket capt = new Cricket();
             capt.ODI_runs=11873;
             capt.dispOdi();
             capt.dispRuns();

             
             ShowRoom yamaha = new ShowRoom();
             yamaha.bikes=11;
             yamaha.dispBikes();
             yamaha.dispCars();


             ShowRoom ninja = new ShowRoom();
             ninja.bikes=8;
             ninja.dispBikes();
             ninja.dispCars();




		
	}
}