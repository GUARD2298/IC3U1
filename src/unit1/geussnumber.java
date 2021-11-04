package unit1;

import java.util.Scanner;

public class geussnumber {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//number
		int secret = (int) (Math.random() * 100) +1;
		while (secret > 1) {
		Scanner keyboard=new Scanner(System.in);
		
		
		Thread.sleep(500);
		System.out.println("guess >:)");
		int guess = keyboard.nextInt();
		
		if (keyboard.hasNextInt()) {
			
		if (guess > secret) {
		System.out.println("Too high");
		}
		
		if (guess < secret) {
		System.out.println("Too low");
		}
		
		if (guess == secret) {
			
		System.out.println("Spot on!");
		Thread.sleep(2000); //Waits 2 seconds
		System.exit(0); //Terminates program
		//x =keyboard.Next();
		}
		}	
		
		
		
		
		
		
		
		
		}
		
		
		
	

}}
