
/* HSA2 Graphics Template program 
 *
 * This is a template for you to copy and use in your programs. You copy the file to a new
 * file name, rename a few things below, and then add your code and change these comments.
 * 
 * @author M. Harwood
 */

package mygraphics; // CHANGE THIS to match the name of the package (folder) that code is in

import hsa2.GraphicsConsole;     // this imports the code from the hsa2 graphics library
import java.awt.Color;   	 // this imports standard Java code for using colors and fonts
import java.awt.Font;

public class Drawing1 //there are three places where THIS name NEEDS TO BE CHANGED when you make a new class. (1)
{
	private static final String Name = null;

	public static void main(String[] args) {
		new Drawing1(); // this is the name of your class. CHANGE HERE (2)
	}

	//Global variables can go here:
	GraphicsConsole gc = new GraphicsConsole(800, 600, "Drawings");

	Drawing1() { //This is the constructor. Name of class. CHANGE HERE (3)
		//all drawing goes here
		gc.setBackgroundColor(Color.GRAY);
		gc.clear();

		//.....
		boolean answer;
		String name;
		boolean user = true;
		answer=true;

		//Sun Drawing
		gc.setColor(new Color(255, 253, 233, 130));
		gc.drawOval(700,8,100,100);
		gc.fillOval(700, 8, 100, 100);
		gc.setColor(Color.BLACK);
		gc.drawOval(700,8,100,100);

		//House
		gc.setColor(Color.RED);
		gc.fillRect(400,350,300,400);

		//Window
		gc.setColor(Color.CYAN);
		gc.fillRect(440,420,75,75);
		gc.setColor(Color.BLACK);
		gc.drawRect(440,420,75,75);

		//:TODO Make this fit the window gc.drawLine(514, 450, 440, 46);

		//Door
		gc.setColor(Color.green);
		gc.fillRect(575,420,100,225);
		gc.setColor(Color.BLACK);
		gc.drawRect(575,420,100,225);
		gc.drawOval(649, 500, 25, 25);

		//Chimney+
		gc.setColor(Color.DARK_GRAY);
		gc.drawRect(430, 305, 30, 45);
		gc.fillRect(430, 305, 30, 45);



		//:Flag
		gc.setStroke(0);
		gc.setColor(Color.WHITE);
		gc.fillRect(100, 100, 180, 100);
		gc.setColor(Color.RED);
		gc.drawMapleLeaf(155, 110, 75, 75);
		gc.fillMapleLeaf(155, 110, 75, 75);
		gc.drawRect(105, 100, 40, 100);
		gc.fillRect(105, 100, 40, 100);
		gc.drawRect(240, 100, 40, 100);
		gc.fillRect(240, 100, 40, 100);
		gc.setColor(Color.BLACK);
		gc.drawRect(100, 100, 180, 100);

		//Flag Pole
		gc.setColor(Color.BLACK);
		gc.setStroke(10);
		gc.drawLine(100, 700, 100, 100);

		//Inactive String: Creates Line for Sunbeam, gc.drawLine (680,90,710,75);


	}

	private void getinput() {
		// TODO Auto-generated method stub

	}}