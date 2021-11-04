
package unit1;

import java.util.Scanner;

/**
 * @author DaviXand361
 *
 */
public class passwordprotection {



	public static void main(String[] args)throws InterruptedException {

		String name;

		System.out.println("Please Enter Username");
		Scanner keyboard=new Scanner(System.in);
		String username = keyboard.next();	

		while (true) {
			if  (username.equals ("davixand361")) {
				davixand361();
				break;
			}
			if  (username.equals ("Admin")) {
				admin();
				break;
			}
			Thread.sleep(600);
			System.out.println("Invalid Input");
			Thread.sleep(800);
			System.out.println("Please Enter Username");
			username = keyboard.next();
		}	
	}

	static void admin() throws InterruptedException {
		Scanner keyboard=new Scanner(System.in);
		int B1 = 72;	
		int B2 = 96;
		int B3 = 82;
		int B4 = 56;
		int attempts=(3);
		System.out.println("Please Enter Admin Password");
		String adminpassword = keyboard.next();

		if (adminpassword.equals("2335")) {
			Thread.sleep(100);
			System.out.print("A");Thread.sleep(100);	System.out.print("d");Thread.sleep(100);System.out.print("m");Thread.sleep(100);System.out.print("i");Thread.sleep(100);System.out.print("n");Thread.sleep(100);System.out.print(" ");
			Thread.sleep(100);System.out.print("A");Thread.sleep(100);System.out.print("c");Thread.sleep(100);System.out.print("c");Thread.sleep(100);System.out.print("e");Thread.sleep(100);System.out.print("s");
			Thread.sleep(100);System.out.print("s");Thread.sleep(100) ;System.out.print(" ");Thread.sleep(100);System.out.print("G");Thread.sleep(100);System.out.print("r");
			Thread.sleep(100);System.out.print("a");Thread.sleep(100);System.out.print("n");Thread.sleep(100);System.out.print("t");Thread.sleep(100);System.out.print("e");Thread.sleep(100);System.out.print("d\n");
			Thread.sleep(600);
			System.out.println("Please enter Command");
			String command = keyboard.next();
			if (command.equals("CreateNew")) { //to do: make this work
				System.out.print("Enter Student Name");
				//Scanner keyboard = new Scanner(System.in);
				String sname = keyboard.next();
				System.out.println(sname);
			}
		
		}


		while(true) {
			attempts = attempts-1;
			if (adminpassword.equals("2335")) {break;}
			if (attempts <= 0) {break;}
			Thread.sleep(600);
			System.out.println("Invalid Input");
			Thread.sleep(600);
			System.out.println("Attempts left: " + attempts);
			Thread.sleep(800);
			System.out.println("Please Enter Admin Password");
			keyboard=new Scanner(System.in);
			adminpassword = keyboard.next();
		}
		if (attempts <= 0) { 
			Thread.sleep(400);
			System.out.print("Self Destruct Program Initialized\n");
			Thread.sleep(1000);
			System.out.println("Self Destructing in 3");
			Thread.sleep(1000);
			System.out.println("Self Destructing in 2");
			Thread.sleep(1000);
			System.out.println("Self Destructing in 1");
			Thread.sleep(300);
		}


	}
	static void createnew() throws InterruptedException{
		System.out.print("Enter Student Name");
		Scanner keyboard = new Scanner(System.in);
		String sname = keyboard.next();
		System.out.println(sname);
	}

	//if (command.equals("Edit Student Mark")) {

	//System.out.print("Enter Student Name");
	//String student = keyboard.next();
	///if (student.equals("davixand361"));
	//System.out.print("Liam Alexander Caughy Davis");
	//System.out.print("\nGrade 11 Student\nStudent ID: 329188361\n");
	//System.out.print(B1 + "%\n" + B2 + "%\n" + B3 + "%\n" + B4 + "%");
	//}


	//}



	static void davixand361() {
		Scanner keyboard=new Scanner(System.in);
		//variables
		String C1 = ("Computer Programming (Harwood): ");
		String C2 = ("Chemistry (Janzen): ");
		String C3 = ("English(Walker): ");
		String C4 = ("Physics(Mitrovic)");
		int B1 = 72;	
		int B2 = 96;
		int B3 = 82;
		int B4 = 56;

		System.out.print("Please enter Password\n\n");
		String password2 = keyboard.next();
		if (password2.equals("12345678"))
		{
			System.out.print("Liam Alexander Caughy Davis");
			System.out.println("\nGrade 11 Student\nStudent ID: 329188361\n");
			System.out.println(C1+ B1 + "%\n" + C2 +B2 + "%\n" + C3 + B3 + "%\n" + C4 + B4 + "%");

		}

		// block of code to be executed if the condition is true
		//} else {
		//System.out.print("Invalid Input");
		// block of code to be executed if the condition is false
	}
}
