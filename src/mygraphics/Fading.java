package mygraphics;

import hsa2.GraphicsConsole;
import java.awt.Color;
public class Fading {
public static void main(String[] args) {
new Graphics_ballbounceprogram();
}
GraphicsConsole gc = new GraphicsConsole (800,600, "Spots");
Fading() {
//Setup section:
gc.setAntiAlias(true);
gc.setLocationRelativeTo(null); //centre window
gc.setBackgroundColor(Color.GRAY);
// $ gc.setBackgroundColor(new Color(120,120,120,10));
gc.clear();
gc.setColor(Color.RED);
//Variables:
int size = 40;
int sleepTime = 5; //in milliseconds
//Main loop:
while(true) {
//make random numbers for location (based on 800,600)
int rx = (int) ((Math.random()* 700)+50);
int ry = (int) ((Math.random()* 500)+50);
gc.fillOval (rx, ry, size, size);
//make random colour for next ball
int r = (int) (Math.random()* 256);
int g = (int) (Math.random()* 256);
int b = (int) (Math.random()* 256);
gc.setColor(new Color(r,g,b));
gc.sleep(sleepTime);
/* the final thing in the loop must be “sleep”.
If it doesn't sleep the graphics may not get updated */
}






}


}
