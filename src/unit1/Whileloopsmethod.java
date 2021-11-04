package unit1;

import java.util.Scanner;

public class Whileloopsmethod {

	static Scanner keyb = new Scanner(System.in);
	
	public static void main(String arrgggg[]) {
		int x = getInt();
		int y = getInt();
		
		System.out.println();
		System.out.println(x + y);
	}	

	/* This method name is getInt
	 * It will return an int
	 * It is static because we're just using text and not objects
	 */
	static int getInt() {
		int num = -1;
		while(true) {
			System.out.print("Enter an integer: ");

			//let's see if there is an integer ready for input
			if (keyb.hasNextInt()) {
				num = keyb.nextInt();
				break;
			} else {
				keyb.next(); //clear whatever was typed from the keyb buffer
				System.out.println("That was not an integer");				
			}
		}
		return num; //send the number back to whoever wants it
	}
}