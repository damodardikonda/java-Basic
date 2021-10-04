class Library{
	
	String libname = " Pune Marathi Granthalay";
    int noOfBooks = 10000;

}

class Books extends Library{
	
	String bookname = " Inside JVM";
	int noOfCopies = 10;

	void info(){

		System.out.println("Library name is = " + super.libname);
		System.out.println(" No of Books are = " + super.noOfBooks);
		System.out.println("Books names are =  " + bookname);
		System.out.println("no of copies available of books are = " + noOfCopies);
	}

	public static void main(String[] args) {
		
		Books b = new Books();
		b.info();
	}
}