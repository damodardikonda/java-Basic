/*Write a Program to calculate Velocity of particle in the space having
Distance & Time Entered By User.
Input:
Distance: 100m
Time: 20sec
Output: The Velocity of a Particle roaming In space is 5m/s.
*/

import java.util.Scanner;


class P3{

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		int dist = sc.nextInt();

        int time = sc.nextInt();

	       
	       int Velocity = dist / time;

	       System.out.println(Velocity);

	}


}