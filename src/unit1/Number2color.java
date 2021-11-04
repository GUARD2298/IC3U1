package unit1;
import java.util.Scanner;
public class Number2color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner keyboard=new Scanner(System.in);

		System.out.println("Enter number a");
		int a = keyboard.nextInt();

		System.out.println("enter number b");
		int b = keyboard.nextInt();

		//if (a OR b <0) {
		//	System.out.println("green");
		//}

		if ((a%2) == 0) {
		
		if (b > a) {
		System.out.println("crimson");
		}
		
		else {
			System.out.println("pink");
		}
		}		
			
		if ((a|b) <0 ) {
		System.out.println("Green");
		
		
		}
		
		if ((a & b) >0) {
System.out.println("navy");
	
		
		}

		if ((a + b)> 100 | (a + b) < 10) { 
		System.out.println("Yellow");
		}
		
	}

}
