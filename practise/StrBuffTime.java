import java.util.GregorianCalendar;

class BuffTime{

	public static void main(String[] args) {
		
		long startTime = new GregorianCalendar().getTimeInMillis();
		long startMemory = Runtime.getRuntime().freeMemory();

		StringBuffer sb = new StringBuffer("Hii");

		for (int i = 0 ; i < 1000000 ; i++ ) {
			
			sb.append("Hello");
		}

		long endTime = new GregorianCalendar().getTimeInMillis();
		long endMemoty = Runtime.getRuntime().freeMemory();
		long timess = endTime - startTime;
		
		System.out.println("Time = "  + timess);
		System.out.println("Memory  = "  + (endMemoty - startMemory));
		

	}
}