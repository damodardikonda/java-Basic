class ConstructDemo{

	int rollNum;

	ConstructDemo(){
       
		rollNum = 100;

	}


	ConstructDemo(int rnum){
        
		rollNum = rollNum + rnum;
	    this(); // Should be first Staterment.......................
	}

	int getRollNum(){

		return rollNum;
	}

	void setRollNum(int rollNum){

		this.rollNum = rollNum ;
	}


	public static void main(String[] args) {
		
		ConstructDemo obj = new ConstructDemo(12);
		System.out.println(obj.getRollNum());
	}
}