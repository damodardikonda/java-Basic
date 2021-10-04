import java.io.*;

class LoginWindow{

	String userName = "Damodar";
	String password = "Damodar";

	String user ;
	String pass ;

	LoginWindow( String u , String p){

		user = u ;
		pass = p;
	}

	void checkUserPass(){

		if (userName == user && password == pass){

			System.out.println(" Login SuccessFul");
		}else{

			System.out.println("Invalid User");
		}
	}

	public static void main(String[] args) throws IOException {
		
          BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
          String u = br.readLine();
          String p = br.readLine();

          LoginWindow lg = new LoginWindow(u,p);
          lg.checkUserPass();
	}
}