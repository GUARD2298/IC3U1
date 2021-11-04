package mygraphics;
import java.awt.Color;

import hsa2.GraphicsConsole;
public class Randomdotsprogram{
	//constants
	final static int WINW = 1000;
	final static int WINH = 1000;

	//global variables
	static GraphicsConsole gc = new GraphicsConsole(WINW, WINH);
	int sleepTime = 1;


	public static void main(String[] args) throws InterruptedException{
		quadscreen();
		randomdots();
	}

	static void quadscreen() {
		gc.setBackgroundColor(Color.MAGENTA);
		gc.setColor(Color.GRAY);
		gc.fillRect(0, 0, 500, 500);
		gc.setColor(Color.PINK);
		gc.fillRect(500, 500, 500, 500);
	}

	static void randomdots() {
		int clr = (int)(Math.random() * 10) + 1;
		int max = 500;
		int min = 0;
	//	for (int i = 1; i <=10000; i++) {
		while(true) {
		int x = (int)(Math.random() * max) + min;
			int y = (int)(Math.random() * max)+min;
			
			if (Math.random()>=0.7) {gc.setColor(Color.WHITE); 
			}
			if (Math.random()<=0.3) {gc.setColor(Color.BLACK); }
			gc.drawOval(x, y, 2, 2);
		}



	}

}



