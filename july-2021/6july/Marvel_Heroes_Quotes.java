import java.util.*;

class Quotes{

	String character_name = null;
	String quote = null;
	String identity = null;

	Quotes(String character_name , String quote , String identity ){

		this.character_name = character_name;
		this.quote = quote;
		this.identity = identity;
	}

	void print_superhero_things(){

		System.out.println(character_name + " " + quote + " " + identity);
	}
}

class MarvelComics implements Comparator<Quotes>{

	public int compare(Quotes q1 , Quotes q2){

		return q1.quote.compareTo(q2.quote);
	}
}

class Marvel {

	public static void main(String[] args) {
		
		ArrayList<Quotes> character = new ArrayList<>();

		character.add(new Quotes("Hulk --> " , "Hulk Smash... / Hulk is stronger in 9 realm -->  " , " Anger "));
		character.add(new Quotes("Thor --> " , " Probably a good man Greate King --> " , "God of Thunder / OdinSon"));
		character.add(new Quotes("Iron Man --> " , "I am Iron Man / Mera usul hai jaan hai tp jaahan hai --> " , " Attitude / Smart"));
		character.add(new Quotes(" captain america --> " , "Other don't define who u r , you do(By your action ) --> " , "Loyalty / Courage "));
		character.add(new Quotes(" Loki --> " ," Glorious Purpose / I am god of mischief --> " , "God of mischief / Good Evil "));


		Collections.sort(character , new MarvelComics());

		for( Quotes q :character)
			q.print_superhero_things();
	}


}