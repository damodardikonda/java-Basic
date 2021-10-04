import java.util.*;

class Java_Features{

	int java_version = 0;
	String feature = null;
	Java_Features(){}
	Java_Features(int java_version , String feature){

		this.java_version = java_version;
		this.feature = feature;
	}

	public String toString(){

		return " Java version is -> " + java_version + " features are -> " + feature; 
	}
}

class CompareVersion implements Comparator<Java_Features>{

	public int compare(Java_Features jf1 , Java_Features jf2){

		return jf1.java_version - jf2.java_version;
	}
}

class Features{

	public static void main(String[] args) {
		
		TreeSet<Java_Features> ts = new TreeSet<Java_Features>( new CompareVersion());

		ts.add( new Java_Features( 8 , " Lambdas , Collections and Streams"));
		ts.add( new Java_Features( 9 , "Collections  , streams , options , interfaces "));
		ts.add( new Java_Features(10 , " Type Inference"));
		ts.add( new Java_Features(11 , "Strings and files"));
		ts.add( new Java_Features(14 , "GC , records "));

		System.out.println(ts);
	}
}