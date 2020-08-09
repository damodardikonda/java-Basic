class LM{
	 public static void main(String[] args) {
	 	
	 	int a=10;
	 	int b=11;

	 	boolean ans;

	 	//ans=(++a <= b++) && (++a <= b++); //(11 <= 11) (12<=12)

        ans=(++a <= b++) || (++a <= b++);
        	 	System.out.println(b);//12

	 	System.out.println(ans);//true
	 	System.out.println(a);//11
	 }

}