
package mygraphics;
import hsa2.GraphicsConsole;
import hsa2.GraphicsConsole;
import java.awt.Color;

public class TwoBalls {

	public static void main(String[] args) {
		new TwoBalls();
	}
	
	//constants
	public final static int WINW = 1200;
	public final static int WINH = 900;
	
	//global variables
	GraphicsConsole gc = new GraphicsConsole(WINW, WINH);
	Ball b1,b2;	
	int sleepTime = 1;
	
	TwoBalls() {
		setup();
		
		//main game loop
		while (true) {			
			moveBall(b1);
			moveBall(b2);
			
			//check for collision
			if(b1.intersects(b2)) {
			
				gc.setBackgroundColor(Color.PINK);
			gc.showDialog("Crash", null);
			//gc.showDialog("Thanks for Playing!", null);
			//System.exit(0);
				//switch speeds
				int temp = b1.vx;
						b1.vx = b2.vx;
						b2.vx = temp;
				temp = b1.vy;
				b1.vy = b2.vy;
				b2.vy = temp;
			}
			drawGraphics();
			gc.sleep(1);
		}	
	}
	
	//gc.showDialog("Thanks for Playing!", null);
	//gc.close();
	
	
	void setup() {	
		gc.setAntiAlias(true);
		gc.setLocationRelativeTo(null);
		//gc.setColor(Color.red.darker());
		b1 = new Ball();
		b2 = new Ball();
		//make ball 2 in a different location from ball 1
		b2.x = 300;
		b2.y = WINH/2;
		b2.clr = Color.BLUE;
	}

	void moveBall(Ball b) {
		b.x += b.vx;
		b.y += b.vy;
	
		//bounce off walls		
		if (b.x < 0 && b.vx < 0) { //left wall			
			b.vx *= -1; 			
		}
		if (b.y < 0 && b.vy < 0) { //top wall
			b.vy *= -1;			
		}
		if (b.x + b.width > WINW && b.vx > 0) { 		//right wall
			b.vx *= -1;			
		}		
		if (b.y + b.height> WINH && b.vy > 0) { 		//bottom wall
			b.vy = -b.vy;			
		}
	}
	
	void drawGraphics() {
		synchronized(gc) {
			//gc.clear();
			gc.setColor(b1.clr);
			gc.fillOval(b1.x, b1.y, b1.size, b1.size);
			gc.setColor(b2.clr);
			gc.fillOval(b2.x, b2.y, b2.size, b2.size);
			String decode;
			//gc.setColor(Color.decode(decode#HCCFF));
		}
	}
	
}
