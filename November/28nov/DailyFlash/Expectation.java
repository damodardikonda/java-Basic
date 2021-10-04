class Expectation{
	
	void expect(int rs , String car){

		System.out.println(" When i was in 3rd standard think that"+ rs +"salary and " + car+ " is enough for me");
	}

	void expect(String car , int rs){

		  System.out.println(" When i was in 9th standard think that"+ rs +"salary and " + car+ " is enough for me");
	}


	void expect(String car , long rs){

		  System.out.println(" Now i think that " + rs + "  and  " + car  +"  i should have" );
	}


	public static void main(String[] args) {
		
		Expectation e = new Expectation();
		e.expect(5000 , " Maruti Suzuki");
		e.expect(" Swift" , 50000);
		e.expect(" Rolls Royals " , 1000000);
	}
}