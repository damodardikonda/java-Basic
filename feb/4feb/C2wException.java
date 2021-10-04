class Core2web extends RuntimeException{

	int a = 20 ;

}

class C2wException{

	public static void main(String[] args) {
		
		try{

			System.out.println(10/0);
		}
		catch(Core2web e){

			System.out.println("Handled");
		}

		System.out.println("Ending Exception");
	}
}


// Runtime la Eception yenare 