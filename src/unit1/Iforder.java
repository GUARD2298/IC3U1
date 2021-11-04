package unit1;
import java.util.Scanner;
public class Iforder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner keyboard=new Scanner(System.in);
	
	System.out.println("Please enter an integer: ");
	int a = keyboard.nextInt();
	
	
	if (a > 10) {
	System.out.println("never");
	System.exit(0);
	}
	
	if (a > 5) {
	System.out.println("yes");
	}
	else {
		
		System.out.println("maybe");
	}
	
	
	
	
	}

}
