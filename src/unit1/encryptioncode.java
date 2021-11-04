package unit1;

import java.util.Iterator;
import java.util.Scanner;

public class encryptioncode {
	private static final int OFFSET = 3;
	public static void main(String[] args) {
		// E T Z O N I R S most likely letters
		String plaintext = getInput();
		String cyphertext = Encrypt(plaintext);
		plaintext=cleanText(plaintext);
		System.out.print(plaintext);
		System.out.print(cyphertext);
		output(cyphertext);
	} // end of main method




	static String getInput() {// gives input back
		Scanner scan = new Scanner(System.in);
		System.out.print("enter your secret message");
		String s = scan.nextLine();
		return s;
	}
	static String Encrypt(String text) { //gives encoded input back
		String encoded="";
		text = text.toUpperCase();
		for(int i = 0; i<text.length(); i++) {
			char c = text.charAt(i);

			if (c>'z')c-=26;{
			encoded +=c;
			//keep on doing the loop
			continue;
			}
			
			c += OFFSET;
			c = (char) (c + OFFSET);
		}
		return encoded;
	}
	//void means it does not return anything
	static void output(String s) {
		for(int i = 0; i < s.length(); i++) {
			//char c=s.charAt(i); creates more compact program
			System.out.print(s.charAt(i));
			//every 5 letters print a space
			if((i+1)%5 == 0) {System.out.print(" ");
			}
		}
	}
	static String cleanText (String s) {
		String newstr="";
		for (int i = 0; i<s.length(); i++) {
			s=s.toUpperCase();
			char c = s.charAt(i);
			if(c>='A' && c<='Z') {newstr = newstr + c;}
			if(c>='0' && <='9') {newstr = newstr + c;}
		}
	}
}
