class MyException extends Exception{

	String msg = null;

	MyException(String str){

		msg = str;
	}

	public String toString(){

		return msg;
	}

	public String getMessage(){

		return msg;
	}
}

class CustomiseException{

	public static void main(String[] args) {
		
		try{

			System.out.println(" In Try");

			throw new MyException(" Customised Exception");
		}catch( MyException me){

			System.out.println(me.toString());

			System.out.println(me.getMessage());
		}
	}
}