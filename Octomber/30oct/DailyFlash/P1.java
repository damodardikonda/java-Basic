 class P1{
 	public static void main(String[] args) {
 		
       StringBuffer sb1 = new StringBuffer();
       System.out.println("default Constructor length " +sb1.length());
       System.out.println("Default constructor capacity"+sb1.capacity());

       StringBuffer sb2 = new StringBuffer("DamodarDikonda");
       System.out.println(" Parameterised Constructor length " +sb2.length());
       System.out.println("Parameterised constructor capacity"+sb2.capacity());

 	}
 }