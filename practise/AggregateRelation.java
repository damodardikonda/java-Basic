class Address{

	String city = null;
	String state = null;
	String country=null;
	int pincode = 0;

	Address(String c ,  String s , String cn , int p){

		city = c;
		state = s;
		country = cn;
		pincode = p;
	}

}

class Employee{

	int id = 0;
	String name = "";
	Address address;
	Employee( int id , String name , Address address){
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void display(){

		System.out.println(" Name is " + name);
		System.out.println(" id = " + id);
		System.out.println("city is = " + address.city);
		System.out.println(" State = " + address.state);
		System.out.println("Pincode is " + address.pincode);
		System.out.println(" Country is " + address.country);
	}



	public static void main(String[] args) {
		
		Address a = new Address("pune" ,  " maharastra" , "india" ,411011);
		Address b = new Address("Mumbai" ,  " maharastra" , "india" ,561011);

		Employee e = new Employee(10 , "Damodar Dikonda" , a);
		e.display();
		Employee e2 = new Employee(20 , "Niket jadhav" , b);
		e2.display();
	}
}