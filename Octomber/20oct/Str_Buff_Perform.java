import java.util.GregorianCalendar;

class Perform_Buff{

	public static void main(String[] args) {
		
		long startTime = new GregorianCalendar().getTimeInMillis();
		long startMem = Runtime.getRuntime().freeMemory();

		StringBuffer sb = new StringBuffer("hiii");

		for (int i = 0 ; i < 10000000 ; i++ ) {
			
			sb.append("Hello");
		}

        long endTime = new GregorianCalendar().getTimeInMillis();
		long endMem = Runtime.getRuntime().freeMemory();

        System.out.println("Time = " + (endTime - startTime));

        System.out.println("Memory = " + (endMem - startMem));
	}
}