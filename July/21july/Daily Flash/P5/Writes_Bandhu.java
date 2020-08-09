class Raavana{


}


class Writes_Bandhu extends Raavana{

	public static void main(String[] args) {
		
		Writes_Bandhu airplane = new Writes_Bandhu(); 

        Raavana air_mech = new Raavana();

        Writes_Bandhu air_idea = null;


        boolean plane = airplane instanceof Writes_Bandhu;//true
        System.out.println(plane);

        boolean pushpak = airplane instanceof Raavana; // true 
        System.out.println(pushpak);

        boolean idea = air_idea instanceof Writes_Bandhu;//false   because it is not an object and reference..
        System.out.println(idea);


	}
} 