class num{

  Number career(){

		System.out.println("Number class");
	   return null;
	}
}

class f extends num{

	Float career(){

		System.out.println("Float class");
        return 0.0f;
	}

}

class Test3{

	public static void main(String[] args) {
		
          f o = new f();
          o.career();


	}
}