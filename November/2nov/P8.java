class Core2web{

	String Company_name = "Microsoft";

	void display(){

		System.out.println("The name of company is = " + Company_name);
	}

}

class bienlearn{

	bienlearn(Core2web ob){

		ob.display();
	}

}


class P7{

	public static void main(String[] args) {
		
		Core2web c2w = new Core2web();
		bienlearn bl = new bienlearn(c2w);
	}
}