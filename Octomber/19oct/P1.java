class P1{

	public static void main(String[] args) {
		
		String s1[] = {"Bobby" ,"Lilly" ,"Arjun","Priti"};
        String s2[] = new String[4];

        for (int i = 0 ; i < s1.length ; i++ ) {
              	

              	if (s1[i] == "Lilly") {
              		
              		s2[i] = "Rosh";
              	}
                else
                  s2[i] = s1[i];
              }      
          
          for (int i = 0 ; i < s2.length ; i++ ) {
          	
          	  System.out.print(s2[i] + " ");
          }

	}
}