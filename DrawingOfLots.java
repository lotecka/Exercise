package Exercise;

import java.util.Random;
import java.util.Scanner;

public class DrawingOfLots {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The system draws a number from 0 to 999. Enter this number");
		int guess = sc.nextInt();
		try {
			 Random r = new Random();
		int number = r.nextInt(1000);
		System.out.println("This number is: " + number);
		
		if (number == guess) {
			System.out.println("Congratulations!");			
		} else {
			System.out.println("I'm very sorry.");
		} 
		} catch (Exception e) {
			System.out.println("You didn't guess.");
		}
		
		
		sc.close();
		
	}
}
		



