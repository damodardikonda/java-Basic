class Degree{

	void getDegree(){

		System.out.println(" I got a degree");
	}
}

class Undergraduate extends Degree{

	void getDegree(){

		System.out.println(" I got a Undergraduate degree");
	}
}


class Postgraduate extends Degree{

	void getDegree(){

		System.out.println(" I got a Undergraduate degree");
	}
}


class University{

	public static void main(String[] args) {
		
		Degree d = new Degree();
		d.getDegree();

		Undergraduate ud = new Undergraduate();
		ud.getDegree();

		Postgraduate pd = new Postgraduate();
		pd.getDegree();
	}
}