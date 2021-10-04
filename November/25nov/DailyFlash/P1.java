class Hostel{

	int hostelID;

	Hostel(int hostelID){

        this . hostelID = hostelID;
 	}

	class Student{

		int studentID ;
		int hostelID ;

		Student( int studentID , int hostelID){

            this.studentID = studentID;
            this.hostelID = hostelID;
		}

        void checkHostelID(){

        	if(this.hostelID == Hostel.this.hostelID){

                 System.out.println("Student is Allowed");
        	}
        	else{

        		System.out.println("Student is not allowed");
        	}
        }

	}

	public static void main(String[] args) {
		
		Hostel h = new Hostel(20);
		Hostel.Student  s1 = h.new Student(22 ,35);
		s1.checkHostelID();

        System.out.println("\n\n");
		Hostel.Student s2 = h.new Student(26 , 20);
		s2.checkHostelID();
	}
}