class Core2web{

}

class Biencaps extends Core2web{

}

class Demo4{

	void m1( Core2web c){

          System.out.println(" Core2web Method");
	}

	void m1( Biencaps b){

		System.out.println( " Biencaps Method");
	}
}

class C2w{

	public static void main(String[] args) {
		
        Demo4 d4 = new Demo4();

        Core2web cc = new Core2web();
        d4.m1(cc);


        Biencaps bie = new Biencaps();
        d4.m1(bie);


        Core2web cc2 = new Biencaps();
        d4.m1(cc2);
	}
}