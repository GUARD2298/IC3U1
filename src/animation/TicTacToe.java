package animation;

import java.awt.Color;
import java.util.Arrays;

import hsa2.GraphicsConsole;

/* This still needs to have winning and tie game logic added */

public class TicTacToe {

	//CONSTANTS
	final static int GRID = 3;        //size of board & grid

	final static int XX = 1;
	final static int OO = -1;
	final static int EMPTY = 0;
	static String w = null;
	//set some colours here
	final static Color COLOURGRID = new Color(140, 140,140);    
	final static Color COLOURBACK = new Color(240, 240, 240);

	//GLOBAL VARIABLES
	static int WINW = 600;
	static int WINH = 600;
	static int boxW, boxH;
	int turn = XX;
	int[][] board = new int[GRID][GRID];


	GraphicsConsole gc = new GraphicsConsole(WINW,WINH);


	public static void main(String[] args) {
		new TicTacToe();
	}


	TicTacToe() {    

		setupGraphics();
		initGame();
		runGame();
	}

	//This will reset the board if you want to play again.
	void initGame() {        
		//TBA        
	}

	//This only needs to be run once
	void setupGraphics() {   
		gc.setResizable(true);  // this is for later. We want to be able to resize it and have everything still work.
		gc.setTitle("TicTacToe");
		gc.setLocationRelativeTo(null); 
		gc.setBackgroundColor(COLOURBACK);
		gc.setAntiAlias(true);                
		gc.enableMouse();        
	}

	//Main Game Loop
	void runGame() {
		while (true) {
			drawGraphics();
			if (gc.getMouseClick() > 0) handleMouseClick();
			gc.sleep(20);
		}
	}

	void handleMouseClick() {
		//In SWING this is in void mouseClicked()  <<<<<<<    
		int mx = gc.getMouseX();
		int my = gc.getMouseY();

		int col = mx/boxW;
		int row = my/boxH;


		//Check if the square is empty        
		if (board[row][col] != EMPTY) return;

		//update board        
		board[row][col] = turn;

		printBoard(); //debug


		//TODO check for the winner


		switch (col){

		case-3:  
			w = gc.showInputDialog("play again? (Press ok to play again, and cancel to end your session)", "O wins!!!!!!!!");
			break;
		case'3':
			w = gc.showInputDialog("play again? (Press ok to play again, and cancel to end your session)", "X wins!!!!!!!!");
			break;
		}

		switch (row) {
		case'3':
			w =gc.showInputDialog("play again? (Press ok to play again, and cancel to end your session)", "X wins!!!!!!!!");

			break;
		case-3:
			w = gc.showInputDialog("play again? (Press ok to play again, and cancel to end your session)", "O wins!!!!!!!!");
			break;
		}
		if (w != null) {
			setupGraphics();
			initGame();
			runGame();
		}
		//if(w.equals(null) ) {
			//System.exit(0);
		//}
		//TODO check for tie


		//change turn
		if (turn == XX) {
			turn = OO;
		} else {
			turn = XX;
		}

		//display whose turn it is in the title 
		gc.setTitle("TicTacToe    " + (turn==XX ? "X" : "O") + " turn");
	}

	void initGraphics() {
		WINW = gc.getDrawWidth();         //These two lines can be here or in the part that handles the mouse click. 
		WINH = gc.getDrawHeight();        //They have to be run regularly in case the user resizes the board.

		//size of each box in pixels.
		boxW = WINW/GRID;
		boxH = WINH/GRID;

	}

	void drawGraphics() {
		initGraphics(); //needed if window is resized

		gc.setColor(Color.BLUE);
		synchronized(gc) {
			gc.clear();

			//Draw grid
			gc.setStroke(1);
			for (int i=1; i<GRID; i++) {                
				gc.drawLine(0, i*boxH, WINW, i*boxH);
				gc.drawLine(i*boxW, 0, i*boxW, WINH);
			}

			//Draw all X and Os
			//Check every square in board[][] and draw an X or O there.
			//Try and resize the window while playing. Everything works.
			gc.setStroke(3);
			gc.setColor(Color.red);
			for(int row=0; row<GRID; row++) {
				for(int col=0; col<GRID; col++){ 
					if (board[row][col] == XX) {
						gc.drawLine(col*boxW,row*boxH, (col+1)*boxW,(row+1)*boxH);
						gc.drawLine((col+1)*boxW,row*boxH, col*boxW,(row+1)*boxH);
					}
					if (board[row][col] == OO) {
						//for drawing x is first. x is column
						gc.drawOval(col*boxW,row*boxH , boxW, boxH);
						//                x,         y,        w    ,    h                
					}
				}
			}

		}
	}

	void printBoard() {
		for(int row=0; row<GRID; row++) {
			for(int col=0; col<GRID; col++){
				System.out.printf("%3d", board[row][col]);
			}
			System.out.println();
		}
		//System.out.println("=========="); //print out dividing line of the correct length
		for (int i = 0; i < GRID*3 +2; i++) System.out.print("=");System.out.println();        
	}


	/*
	 * if (col>0 && lights[col-1][row] == OFF) {            
        }
	 */

}