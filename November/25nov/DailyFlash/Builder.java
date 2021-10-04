import java.util.*;

class GYM{

	class Day0{

		void workOutPlan(){

			System.out.println(" Shoulder Day");
		}
	}

	class Day1{

		void workOutPlan(){

			System.out.println(" Tricep Day");
		}
	}

	class Day2{

		void workOutPlan(){

			System.out.println(" Back Day");
		}
	}

	class Day3{

		void workOutPlan(){

			System.out.println(" Bicep Day");
		}
	}

	class Day4{

		void workOutPlan(){

			System.out.println(" Chest Day");
			
			}
	}

	class Day5{

		void workOutPlan(){

			System.out.println(" Leg Day");
		}
	}

	void todaysWorkOutPlan(){

		System.out.println(" CHeck in the List");
	}
}

class Builder{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	
		GYM gym = new GYM();
		gym.todaysWorkOutPlan();
		 
		System.out.println(" Enter the Choice");
		int ch = sc .nextInt();

		 switch(ch){

		 	case 0 :

                  GYM.Day0 d0 = gym.new Day0();
                  d0.workOutPlan();
                  break;


		 	case 1 :

                  GYM.Day1 d1 = gym.new Day1();
                  d1.workOutPlan();
                  break;


		 	case 2 :

                  GYM.Day2 d2 = gym.new Day2();
                  d2.workOutPlan();
                  break;


		 	case 3 :

                  GYM.Day3 d3 = gym.new Day3();
                  d3.workOutPlan();
                  break;


		 	case 4 :

                  GYM.Day4 d4 = gym.new Day4();
                  d4.workOutPlan();
                  break;


		 	case 5 :

                  GYM.Day5 d5 = gym.new Day5();
                  d5.workOutPlan();
                  break;
                   }



	}
}










