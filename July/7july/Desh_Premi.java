class Hindustani_Bhau{

	static int no_of_followers=3000000;
	int no_of_post=276;

	static void display_no_of_followers(){
		System.out.println("Bhau Followers on Instagram:- "+no_of_followers);
	}

    void display_no_of_post(){
    	System.out.println("Bhau Numbar of post in Instagram is :- " +no_of_post);
    }


    void famousDialogue(){
    	System.out.println("Hindustani Bhau..Jai Hind Doston....Ruko jara Sabar Karo");
    }
}


class MajorGDBakshi{

	static int no_of_followers=100000;
	int no_of_post=20;

	static void display_no_of_followers(){
		System.out.println("Major GD Bakshi's Followers on Instagram:- "+no_of_followers);
	}

    void display_no_of_post(){
    	System.out.println("Major GD Bakshi's Numbar of post in Instagram is :- " +no_of_post);
    }


    void famousDialogue(){
    	System.out.println("Saglyanna mahitiche ");
    }
}


class Desh_Premi{

	public static void main(String args[]){

		Hindustani_Bhau bhau=new Hindustani_Bhau();
		Hindustani_Bhau.display_no_of_followers();
		bhau.no_of_post=279;
		bhau.display_no_of_post();
		bhau.famousDialogue();

        System.out.println("\n\n");

       MajorGDBakshi major = new MajorGDBakshi();
       MajorGDBakshi.display_no_of_followers();
	   major.no_of_post=12;
	   major.display_no_of_post();
	   major.famousDialogue();








	}
}












