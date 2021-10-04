class StudentData{

    int roll ;
    String name;
    int marks;

	StudentData(){

		System.out.println("Default Constructor");
	}

	StudentData(int roll , String name , int marks){

		this.roll = roll;
		this.name = name ;
		this.marks = marks;

		System.out.println("Roll no is = " + roll);
		System.out.println("name is = " + name);
		System.out.println("marks are = " + marks);
	}

	public static void main(String[] args) {
		
		StudentData s1 = new StudentData();
		StudentData s2 = new StudentData(20 , "Damodar ", 999);
	}
}