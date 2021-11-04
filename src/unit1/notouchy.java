package unit1;	// change this to match the name of the package (folder) that code is in

import hsa2.GraphicsConsole;	// this imports the code from the hsa2 new package
import java.awt.Color;   	// this imports code for using colors and fonts
import java.awt.Font;

public class notouchy	//there are three places where this name needs to be changed when you make a new class. (1)
{
	public static void main(String[] args)
	{
		new notouchy(); // this is the name of your class (2)
	}

	//Global variables here:
	GraphicsConsole gc = new GraphicsConsole(800, 600, "HSA2 Graphics");

	notouchy(){ //constructor. Name of class. (3)
		//all drawing goes here
		gc.setBackgroundColor(Color.WHITE);
		gc.clear();
gc.setStroke(2);
		gc.setColor(Color.RED);
		gc.drawLin
		
		//.....
	}

} //end of class