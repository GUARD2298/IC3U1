package unit1;

import java.util.Scanner;

public class whatsbigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard=new Scanner(System.in);

		System.out.println("Enter a number");
		int a = keyboard.nextInt();

		System.out.println("enter another number");
		int b = keyboard.nextInt();


		if (a > b ) {
			System.out.println(a + " is greater than " + b);
		}
		if (b > a ) {
			System.out.println(b + " is greater than " + a);
		}



	}
}
