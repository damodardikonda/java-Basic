class P2{
	
	String name = " Damodar ";
	int marks = 500;
	int age = 28;
	float percent = 99.57f;

	P2( String name , int marks , int age , float percent){

         this. name = name ;
         this.marks = marks;
         this.age = age;
         this.percent = percent;

	 System.out.println("Name is = " + name);
	 System.out.println("Marks are = " + marks);
	  System.out.println("Age is = " + age);
	 System.out.println("percent are = " + percent);
	}

    public static void main(String[] args) {
    	
    	P2 obj = new P2("Damodarrrr" , 400 , 21 , 98.40f);
    }
}