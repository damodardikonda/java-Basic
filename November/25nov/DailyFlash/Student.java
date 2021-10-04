class Core2Web{

	static int noOfEmp = 200;
	String CEO = "Shashi Bagal sir";

	class Incubator{

		int teams = 10;
		int noOfStud = 8;

		void incubatorInfo(){

			System.out.println("Number Of Employee = " + Core2Web.this.noOfEmp);
			System.out.println("Founder of core2web is " + Core2Web . this.CEO);
			System.out.println(" Number of teams selected bty incubator = " + this . teams);
            System.out.println("max no of stuydent is = " + this.noOfStud);
			}
	}
}

class Studentss{

	public static void main(String[] args) {
		
		Core2Web c2w = new Core2Web();
		Core2Web.Incubator ibtr = c2w. new Incubator();
		ibtr.incubatorInfo();

	}
}