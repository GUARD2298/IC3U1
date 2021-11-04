package unit1;
import java.util.Scanner;
public class Scannerpractice {

	public static void main(String[] args) { 




		{

			Scanner keyboard=new Scanner(System.in);
			//Scanner sc=new Scanner(System.in); How is this different from keyboard???

			//System.out.print("\nPlease enter 1 number: ");   
			//int number1 = sc.nextInt();

			//system.out.print("\nPlease enter a 2nd number: ");   
			//int number2 = sc.nextInt();

			//System.out.print("Please enter an operation (ie: +,-): ");
			//int opp = sc.nextInt();

			//String name = keyboard.toString(); What does this do???

			System.out.print("What is your first and last name? ");
			String name = keyboard.next();
			String lname = keyboard.next();
			System.out.print("\nHello " + name + " " + lname + "!");


			System.out.print("\n\nWhat is your age? ");
			int age = keyboard.nextInt();
			System.out.print("\n" + age + ", thats pretty old!\n");

			System.out.print("\nHow much do you weigh?: ");
			double weight = keyboard.nextDouble();
			System.out.print("\n" + weight + " is a good weight\n");

			System.out.print("\nHow many feet tall are you? ");
			int height = keyboard.nextInt();

			System.out.print("\nAnd how many inches? ");
			int inches = keyboard.nextInt();

			System.out.print( "\n" + height + "'"  + inches + "\" is a good height! ");

			//System.out.print("hello " + name);

			//int answer = sc.nextInt();
			// answer = number1 + opp + number2; 
			// System.out.print(answer);
		

		
		}}}















