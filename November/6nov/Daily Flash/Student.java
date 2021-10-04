class Student{
	
	String name ;
	int roll;
	int marks;

	Student(String n , int r, int m){

        name = n;
        roll = r;
        marks = m ;

        System.out.println("Name is = " + name);
         System.out.println("roll number is = " + roll);
          System.out.println("marks is = " + marks);
	}


	Student( int r, int m){

        roll = r;
        marks = m ;

        System.out.println("roll number is = " + roll);
          System.out.println("marks is = " + marks);
	}

	public static void main(String[] args) {
		
		Student s1 = new Student("Damodar" , 20 , 990);
		Student s2 = new Student(30 , 790);
	}
}

