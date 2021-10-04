class StringMatch{

	public static void main(String[] args) {

		String regex = ".@.";
	



		StringMatch.compare("HackerEarth.com" , regex);
		StringMatch.compare("a@N" , regex);
	StringMatch.compare("java@Proram" , regex);


}

public static void compare(String str , Str ing regex){

		if(str.matches(regex)){

			System.out.println(str + " matches");
		}else{

			System.out.println(str + " dioes noy match");
		}
}
}
