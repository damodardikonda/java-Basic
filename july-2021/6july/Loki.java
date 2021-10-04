import java.util.*;
class Loki{

	String episode_name = null;
	int episode_no = 0;
	float time = 0.0f;

	Loki(String name , int no , float time){

		episode_name = name ;
		episode_no = no;
		this.time = time;
	}

	public void Loki_webseries_episodes(){

		System.out.println( episode_no + " " + episode_name + " " + time);
	}

}

class LokiWebseries implements Comparator<Loki>{

	public int compare(Loki e1 , Loki e2){

		return e1.episode_no - e2.episode_no;
	}
}

class MarvelLokiEpisodes{

	public static void main(String[] args) {
		
		ArrayList<Loki> loki_varients = new ArrayList<Loki>();

		loki_varients.add(new Loki("Glorious Purpose " , 1 , 48.53f));
		loki_varients.add(new Loki("The Varient " , 2 , 43.38f));
		loki_varients.add(new Loki("Lamentis" , 3 , 44.20f));
		loki_varients.add(new Loki("The Nexus Event " , 4 , 43.29f));
		loki_varients.add(new Loki("Journey into mystery" , 5 , 43.29f));

		Collections.sort(loki_varients , new LokiWebseries());

		for(Loki l : loki_varients){

				l.Loki_webseries_episodes();
		}


	}
}