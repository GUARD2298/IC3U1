/**
 * 
 */
package unit1;

import java.util.Scanner;

/**
 * @author DaviXand361
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner keyboard=new Scanner(System.in);
		System.out.print("Please enter a number? ");
		int number = keyboard.nextInt();

		System.out.print("Please enter a second number: ");
		int number2 = keyboard.nextInt();

		System.out.print("Please enter operation (ie: +, -, *, /): ");
		char operation = keyboard.next().charAt(0);

		if (operation == '*')
		{
			System.out.print(number * number2 + " is the calulation.");
		}
		if (operation == '/')
		{
			System.out.print(number / number2 + " is the calulation.");

		}
		if (operation == '-')
		{
			System.out.print(number - number2 + " is the calulation.");
		}
		if (operation == '+')
		{
			System.out.print(number + number2 + " is the calulation.");
		}
		else
		{ 
			System.out.print("\nInvalid Input");
		}


	}
}
