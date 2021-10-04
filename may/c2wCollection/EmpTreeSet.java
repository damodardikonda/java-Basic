import java.util.*

class Employee implements Comparator{

	int eid = 0 ;
	String eName = null;
	double sal =0.0;

	Employee(int eid , String eName , double sal){

		this.eid = eid;
		this.eName = eName;
		this.sal = sal;
	}

}