import java.util.*;

class Singer{

	String name =null;
	int songs = 0;
	String famous_song = null;

	Singer(String name , int songs , String famous_song){

		this.name = name ;
		this.songs = songs;
		this.famous_song= famous_song;
	}

	public String toString(){

		return name + " " + songs + " " + famous_song ;
	}
}

class SortBySongs implements Comparator<Singer>{

	public int compare(Singer s1 , Singer s2){

		return s2.songs - s1.songs;
	}
}


class Songs_of_Singer{

	public static void main(String[] args) {
		
		TreeSet<Singer> ts = new TreeSet<Singer>( new SortBySongs());
		
		ts.add( new Singer("Mohit Chauhan" , 262 , "Kun faya Kun"));
		ts.add(new Singer( " K. K. " , 320 , " Labon Ko "));
		ts.add( new Singer(" Arijit Singh " , 420 , " Hawayein"));
		ts.add( new Singer( " Atif Aslam " , 410 , "Tu jane na "));

		System.out.println(ts);
	}
}