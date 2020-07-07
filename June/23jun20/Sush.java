//Class  sushant using varargs insted of args

class Sush{


	//public static void main(String movies...) // JVM is giving an error


	public static void main(String... movies) //3 dots is nothing but varargs
	{

		System.out.println("The length of movies is:-"+ movies.length);
	}
}