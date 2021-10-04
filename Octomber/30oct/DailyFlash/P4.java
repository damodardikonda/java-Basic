class P4{
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Healthy");

        StringBuffer sb2 = new StringBuffer("Healthy");
        System.out.println(sb2.insert(4 , " "));

      System.out.println("Delete char at 4 " + sb2.deleteCharAt(4));
	}
}