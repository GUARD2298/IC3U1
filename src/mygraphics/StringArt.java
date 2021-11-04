package mygraphics;

import java.awt.Color;

import hsa2.GraphicsConsole;

public class StringArt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new StringArt();
	}
GraphicsConsole gc = new GraphicsConsole (1400, 800, "String Art");
		

StringArt() {
	gc.setBackgroundColor(Color.BLACK);
	gc.clear();
	gc.setAntiAlias(true);
	gc.setStroke(1);


int x1, y1, x2, y2;
x1=200;
x2=21;
y1=300;
y2=200;

gc.setColor(Color.GREEN);
for(int i = 0; i <=40; i--) {
gc.drawLine(x1,x2,y1,y2);
x1+=12;
x2-=2;
y1+=20;
y2-=20;
}
}

}


