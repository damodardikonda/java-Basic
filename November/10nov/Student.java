class Core2web{
	
	Core2web(){

		System.out.println("Core2web Constructor");
	}

	void Learning(){

		System.out.println("Java / OS batch");
		System.out.println(" Shashi Sir");
	}
}

class Incubator extends Core2web{

	Incubator(){

		System.out.println("Incubator Constructor");
	}

	void implementation(){

		System.out.println("Projects ");
		System.out.println(" Self Learning");
	}
}

class Network extends Core2web{

	Network(){

		System.out.println("Network Constructor");
	}

	void connect(){

		System.out.println("Coders Community");
		System.out.println("Guide : Professor");
	}
}

class Student{

	public static void main(String[] args) {
		
		Core2web c2w = new Core2web();
		c2w.Learning();

		System.out.println("\n\n\n");

		Incubator ibtr = new Incubator();
		ibtr.implementation();
        ibtr.Learning();

        System.out.println("\n\n\n");

        Network net = new Network();
        net.connect();
        net.Learning();

	}
}