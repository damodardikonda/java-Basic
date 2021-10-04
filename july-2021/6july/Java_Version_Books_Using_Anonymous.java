import java.util.*;

class Java_Books{

	int version = 0;
	String book_name = null;

	Java_Books(int version , String book_name){

		this.version = version;
		this.book_name = book_name;
	}

	void disp(){

		System.out.println( " version --> " + version + " Book name --> " + book_name);
	}
}

class Java_Features_Demo{

	public static void main(String[] args) {
		
		ArrayList<Java_Books> al = new ArrayList<Java_Books>();

		al.add( new Java_Books( 3 , "Core Java an integrated Approach"));
		al.add(new Java_Books(4 , " Head First java"));
		al.add(new Java_Books(5 , " Elective Java"));
		al.add(new Java_Books(6 , "Thinking in java"));
	
		Comparator<Java_Books> c = new Comparator<Java_Books>(){

			public int compare(Java_Books jb1 , Java_Books jb2){

				return jb1.version - jb2.version;
			}
		};

		Collections.sort(al , c);

		for(Java_Books  j :al)
			j.disp();
	}
}