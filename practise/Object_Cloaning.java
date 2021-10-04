// Cloning of object without using Clonable object

class Obj_Clone {
	
	String name = null;
	int id = 0;


	/*public Object clone() throws CloneNotSupportedException{

		return super.clone();
	}*/

	Obj_Clone(String name , int id ){

		this.name = name;
		this.id = id;
	}

public static void main(String[] args) {
	try{
	Obj_Clone obj = new Obj_Clone("damodar" , 10);
	Obj_Clone obj2 = (Obj_Clone)obj.clone();

	System.out.println(" Address of Obj is = " + obj.hashCode());
	System.out.println(" Address of obj2 is = " + obj2.hashCode());

	System.out.println(obj2.name);
	System.out.println(obj2.id);
	} catch(CloneNotSupportedException ce ){}
	
	}
}