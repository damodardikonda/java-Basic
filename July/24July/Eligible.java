
import java.util.Scanner;
class Eligibility{
	
	

       boolean isEligible(int attendance){

         
         
       	if(attendance > 75){

       		System.out.println("Student is Eligible for Exams");

       	} else {

       		System.out.println("Processing");

       		System.out.println("Student is not eligible for Exam");
       	}

          
          return true;

       }

  public static void main(String args[]){

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number");
       int attendance=sc.nextInt();


       Eligibility eligible = new Eligibility();
       eligible.isEligible(attendance);


	}
}