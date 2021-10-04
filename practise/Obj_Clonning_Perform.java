class Clone_Perform implements Cloneable{
	int i = 0;
	Clone_Perform(int i){

		this.i = i;
	}
	public Object clone()throws CloneNotSupportedException{  	
	return super.clone();  
	}  
	public static void main(String[] args) {
	/*long startTime = new GregorianCalendar().getTimeInMillis();
		long startMem = Runtime.getRuntime().freeMemory();

		StringBuilder sb = new StringBuilder("hiii");

		for (int i = 0 ; i < 1000000 ; i++ ) {
	*/		try{
			Clone_Perform pbs = new Clone_Perform(10);
			Clone_Perform px = (Clone_Perform) pbs.clone();
		
		System.out.println("Hashcode of pbs = " + pbs.Hashcode());
		System.out.println(" Hashcode of px = " + px.Hashcode() );
		} catch (CloneNotSupportedException c ){}
		
		/*}
		
        long endTime = new GregorianCalendar().getTimeInMillis();
		long endMem = Runtime.getRuntime().freeMemory();

        System.out.println("Time = " + (endTime - startTime));
*/
	}
}