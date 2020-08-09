class Human{

	public static void main(String[] args) {
		
		Human lion =null;//it is not reference or instance
		Human tiger =null;//It is not reference or object
		Human puma =null;//it is not reference or instance

		Human monkey = new Human();

		boolean isLionHuman = lion instanceof Human ;// false
		System.out.println("Are Lion And Human of Same Species --> " + isLionHuman );
		// Human lion = new Human();


        boolean isTigerHuman = tiger instanceof Human ;// false
		System.out.println("Are Tiger And Human of Same Species --> " + isTigerHuman );
		//Human tiger = new Human();


         boolean isPumaHuman = puma instanceof Human ;// false
		System.out.println("Are Puma And Human of Same Species --> " + isPumaHuman );
		//Human puma = new Human();


        boolean isMonkeyHuman = monkey instanceof Human ;// true
		System.out.println("Are monkey And Human of Same Species --> " + isMonkeyHuman );
		

	}
}