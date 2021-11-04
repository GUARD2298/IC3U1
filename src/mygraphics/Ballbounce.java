package mygraphics;

import hsa2.GraphicsConsole;	// this imports the code from the hsa2 new package
import java.awt.Color;   	// this imports code for using colors and fonts
import java.awt.Font;

public class Ballbounce
{

	//set the size of the drawing panel
	final static int panW = 800;
	final static int panH = 700;

	public static void main(String[] args)
	{
		new Ballbounce();
	}

	//Global variables here:
	GraphicsConsole gc = new GraphicsConsole(panW, panH, "HSA2 Graphics");

	Ballbounce(){ 

		gc.setBackgroundColor(Color.BLUE);
		gc.clear();



		//Do all your drawing here
		//for(int x = 0; x < panW; x++) {
		//for(int y = 0; y < panH; y++) {
		//gc.setColor(new Color(x%256, y%256, (x+y)%256));
		//gc.drawLine(x,y, x,y);
	}
	//	}

}

//} //end of class