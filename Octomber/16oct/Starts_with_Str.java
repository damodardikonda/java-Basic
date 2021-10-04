class Str_StartWith{

	public static void main(String[] args) {
		
		String s1 = " Damodar";
		String s2 = new String("Dikonda");
		String s3 = "Bhaskar";
		String s4 = new String("     Hiii");
          
          System.out.println(s1);
          System.out.println(s2);
          System.out.println(s3);

         // s1 = s1.startsWith("Dam"); error return type should be boolean
          System.out.println(s1.startsWith("Dam")); //false
          System.out.println(s2.startsWith("Dik")); //true
          System.out.println(s3.startsWith("Dik")); //false
          System.out.println(s3.startsWith(" Hi")); //false
          


          System.out.println(s1.endsWith("Dar")); //false
          System.out.println(s2.endsWith("konda")); //true
          System.out.println(s3.endsWith(" kar  ")); //false
          
          boolean s6 = s4.endsWith("ii");
          System.out.println(s6); //true
          
		}
}