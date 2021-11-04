package unit1;

import java.util.Scanner;

public class programmingbydoing17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub




Scanner keyboard=new Scanner(System.in);
//Scanner sc=new Scanner(System.in); How is this different from keyboard???



System.out.print("What is your first and last name? ");
String name = keyboard.next();
String lname = keyboard.next();
System.out.print("\nHello " + name + " " + lname + "!");


System.out.print("\n\nWhat is your Grade? ");
String grade = keyboard.next();


System.out.print("\nWhat is your student ID number?: ");
String id = keyboard.next();


System.out.print("\nWhat is your student login? ");
String login = keyboard.next();

System.out.print("\nWhat is your GPA? ");
String gpa = keyboard.next();



System.out.println(""
		+ "\nThank you " + name + " " + lname + ". You are in grade " + grade + ", "+ "your" + " "
+ "student number is " + id + ". Your login is " + login + " and your current GPA is " + gpa + ".");





}}
