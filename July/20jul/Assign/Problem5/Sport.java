/* Write a Java code considering your favorite sports/games i.e. either indoor or outdoor (if
more than one game, make one class for each game) which must have at least one static variable,
instance variable, static method and one instance method.*/



class Football{

	static int referry=2;
	static int no_of_players=11;

	void Real_Madrid(){

		System.out.println("This is Real madrid ");

		System.out.println("The Number Of players in Real Madrid is " + no_of_players );
		--no_of_players;
		System.out.println("Due to Accident Number of players is " + no_of_players );



	}

    static void Match_Referry(){

		System.out.println("This is UEFA Champians League ");
		System.out.println("There are " +referry + " in this Match  ");


	}



}



class Cricket{

	static int Bcci_adhyaksha=1;
	static int no_of_coatch=6;

	void Indian_Coatch(){

		System.out.println(" Ravi Shastri ");
		System.out.println("The Number Of Coach in Real Madrid is " + no_of_coatch );


	}

    static void Display_Adhyaksha(){

		System.out.println(" BCCI has only "+ Bcci_adhyaksha+ " Adhyaksha" );


	}



}


class Sport{

	public static void main(String[] args) {
		
		Football match =new Football();
		match.Real_Madrid();
		match.Match_Referry();


		Football match2 =new Football();
		match2.Real_Madrid();
		match2.Match_Referry();


		Cricket politics = new Cricket();
		politics.Indian_Coatch();
		politics.Display_Adhyaksha();

		Cricket cric = new Cricket();
		cric.Indian_Coatch();
		cric.Display_Adhyaksha();




	}
}