package unit1;
import java.util.Scanner;
public class Forloop1 {

	public static void main(String[] args)throws InterruptedException {
		
		Scanner keyboard=new Scanner(System.in);
		
		for(int i=0; i<=200; i++) {System.out.print(" " + i + " ");}
		Thread.sleep(500);
		System.out.println();

		for (int k=50; k<=150; k++) {System.out.print(" " + k + " ");}

		Thread.sleep(500);
		System.out.println();
		
		for (int j=1; j<=200; j=j+3) {System.out.print(" " + j + " ");}
		
		Thread.sleep(500);
		System.out.println();
		
		for (int h=200; h<=1; h--) {System.out.print(" " + h + " ");}
		
		System.out.print("Please enter a number: ");
		int x = keyboard.nextInt();
		Thread.sleep(300);
		for (int y=1; y<=x; y++) {System.out.print(" " + y + " ");}
			
	
	}
	
}
