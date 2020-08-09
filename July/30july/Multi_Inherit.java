class Human{

	void humans(){

		System.out.println("Human Being");
	}
}

class Dog extends Human{

	void doggy(){

		System.out.println("Dog is an Animal");
	}
}

class Tiger extends Human{

	void tig(){

		System.out.println("tiger  is an most dengerous Animal");
	}
}


class Multi_Inherit{
	public static void main(String args[]){

    Tiger t = new Tiger();
    t.tig();
    t.humans();
    //t.doggy(); error


	}
}