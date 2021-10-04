class Buff{

	public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Core2web");
        StringBuffer sb2 = new StringBuffer("Technologies");


        int len = sb.length()+sb2.length();
        int l1 = sb.length();
        char ch[] = new char[len];
        for (int i = 0 ; i < sb.length() ; i++ ) {
        			
        			ch[i] = sb.charAt(i);

        		}		

        for (int i = l1 +1 ; i < len ; i++ ) {
        	
        	ch[i] = sb2.charAt(i);
        }

        for (int i = 0 ; i < ch.length ; i++ ) {
                

        System.out.print(ch[i]);	
        }
	}
}