class obj{

  Object career(){

		System.out.println("Object class");
	   return null;
	}
}

class str extends obj{

	String career(){

		System.out.println("String class");
        return null;
	}

}

class Test2{

	public static void main(String[] args) {
		
          obj o = new obj();
          o.career();


	}
}