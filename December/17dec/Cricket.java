class Cricket{

    void match(){

    	System.out.println(" Void methos");
    }

    String match(){

    	System.out.println("Virat Kohli");
    }

    int match(){

    	System.out.println(" 3000 runs");
    }

    float match(){

    	System.out.println(" 98.20 avg");
    }
	public static void main(String[] args) {
		
          Cricket c = new Cricket();
          c.match();
	}
}