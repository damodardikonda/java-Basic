class Str_Append{

    public static void main(String[] args) {
    	
    	StringBuffer sb = new StringBuffer("Core2web");
    	String s = "technologies";

    	int len = sb.length();
    	int len2 = s.length();
    	int len3 = len + len2;

    	for (int i = 0 ; i < len3 ; i++ ) {
    	  	
    	  	  if( i == len+1){

    	  	  	    char c = s.charAt(i);

    	  	  	    for (int j = len+1 ; j < len3 ; j++ ) {
    	  	  	    	
    	  	  	    	sb = sb.append(c);
    	  	  	    }
    	  	  }
    	  }  

    	  System.out.println(sb);
    }
}