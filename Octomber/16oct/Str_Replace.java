class Str_Replace{

	public static void main(String[] args) {

       
        String s1 = "Damodar";
        s1.replace("a" ,"s");

        System.out.println(s1);		//Damodar
	
        System.out.println(s1.replace("a" ,"s")); //DsmoDsr

        s1 = s1.replace('a' ,'s');

        System.out.println(s1);	// Dsmodsr
        
        System.out.println(s1.intern());     
	}
}