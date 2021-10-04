import java.util.GregorianCalendar;

class Perform_Build implements Cloneable{

	int i = 0;

	Perform_Build( int i ){

		this.i = i;
	}
	public Object clone()throws CloneNotSupportedException{  	
	return super.clone();  
	}
	public static void main(String[] args) {
		
		long startTime = new GregorianCalendar().getTimeInMillis();
		long startMem = Runtime.getRuntime().freeMemory();

		StringBuilder sb = new StringBuilder("hiii");

		for (int i = 0 ; i < 1000000 ; i++ ) {
			try{
			Perform_Build pb = new Perform_Build(i);
			Perform_Build p = (Perform_Build) pb.clone();
		}
		catch(CloneNotSupportedException ce){}
	}

        long endTime = new GregorianCalendar().getTimeInMillis();
		long endMem = Runtime.getRuntime().freeMemory();

        System.out.println("Time = " + (endTime - startTime));

        System.out.println("Memory = " + (endMem - startMem));
	}
}