package animation;

import java.awt.Color;

import hsa2.GraphicsConsole;

public class Mouse1 {
	public static void main(String[] args) {

		new Mouse1();

	}
	GraphicsConsole gc= new GraphicsConsole(1000,1000,"Unicorns Exist");
	int mx,my; //mouse position
	Mouse1(){
		setup();

		while(true) {
int i = 0;			
if(gc.getMouseClick()>i) {
gc.setColor(new Color(Color.HSBtoRGB((float)Math.random(), mx, mx)));
i = i++;
}

			gc.sleep(1);

			mx = gc.getMouseX();
			my = gc.getMouseY();
			drawGraphics();
		}
	}

	void setup() {
		gc.setAntiAlias(true);
		gc.setLocationRelativeTo(null);
		gc.setBackgroundColor(Color.BLACK);
		gc.clear();
		gc.enableMouse(); //allows clicking
		gc.enableMouseMotion(); //allows moving and dragging

	}
	void drawGraphics() {
		gc.setColor(Color.YELLOW);
		gc.drawLine(350, 350, mx, my);

	}

}
