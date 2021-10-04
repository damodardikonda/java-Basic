class Hospital{

	static class Doctor{

		void serviceAt(){

			System.out.println("Work At Hospital");
		}
	}

	public static void main(String[] args) {
		
		Doctor d =new Doctor();
		d.serviceAt();
	}
}