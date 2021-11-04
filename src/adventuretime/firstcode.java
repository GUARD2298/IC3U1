package adventuretime;
import java.awt.Color;
import java.awt.Polygon;
import java.util.Scanner;
import hsa2.GraphicsConsole;
public class firstcode {
	final static int WINW = 1000;
	final static int WINH = 1000;
	static String name;
	static boolean win;
	final static int GRID = 3;
	final static int XX = 1;
	final static int OO = 1;
	final static int EMPTY = 0;
	static GraphicsConsole gc = new GraphicsConsole(WINW, WINH);
	public static void main(String[] args) throws InterruptedException{
		int[][] board = new int[GRID][GRID];
		System.out.print(board);
		int numbers[] = new int[10];
		numbers[3] = 100;
		numbers[8] = numbers[3]/2;
		System.out.print(numbers[8]);
		dialog();

		String game = gameselect();
		if (game.equals(null)) {
			gc.showInputDialog("Please enter Action or Adventure", "Error");
			gameselect();
		}
		if (game.equals("Action")) {
			//new actionpath();
			actionpath();
		}
		else {gc.showDialog("Please enter Action or Adventure", "Error");
		gameselect();
		}
		if(game.equals("Adventure")) {
			actionpath();
		}
		else {
			gc.showDialog("Please enter Action or Adventure", "Error");
			gameselect();
		}
	}

	static void actionpath() throws InterruptedException{
		drawActionGraphics();
		String Ct1 = gc.showInputDialog("The story takes place in a small village in ancient Greece. You are a shephard,"
				+ " \"the guardian of the sheep\" You are known around the village for: (enter A, B, C,D, or E) \nA:Your "
				+ "cunning mind \nB:Strength \nCUnique connection with animals  \nD:Ability to lead\n E: Pet Rat(just a "
				+ "normal rat)", "Prologue");

		if (Ct1.equals("A")) {Ct1 = "Your Cunning mind";}
		if (Ct1.equals("B")) {Ct1 = "Strength";}
		if (Ct1.equals("C")) {Ct1 = "Unique connection to animals";}
		if (Ct1.equals("D")) {Ct1 = "Ability to lead";}
		if (Ct1.equals("E")) {Ct1 = ("Ordinary boring pet rat that you should not have chosen");}

		//if (Ct1 !=("A") |  Ct1 !=("B") | Ct1 !=("C") | Ct1 !=("D") | Ct1.equals(null)){actionpath();}
		gc.showDialog("Yes you are renowned for your " + Ct1, ".");
		String w = gc.showInputDialog("As you ponder your acheivements you absentmindedly grip "
				+ "your (Enter A,B, or C) \n A:Spear\nB:Sword\nC:Bow", " ");
		if (w.equals("A")) {w = "Spear"; }
		if (w.equals("C")) {w = "Bow"; }
		String pet = gc.showInputDialog("You shift your gaze towards your trusty companion, your"
				+ " pet (Enter A,B, or C) \nA: Cowardly Tiger \nB: Lighting mouse \nC: Owl", "Pet");
		String an1 = gc.showInputDialog("Suddenly a wild wolf appears! What do you do? (Enter A,B"
				+ ",C, or D) \nA: Command pet to attack\nB: Shout \"I HAVE THE POWER\"\nC: Call f"
				+ "or help\nD:run away", "Wolf!!!");
		switch(an1) {
		case "A":
			if (pet.equals("B")){gc.showDialog("With an epic cry you shout \"pikachu I choose you!!\" "
					+ "and toss down your pokeball, \"Use Lighting strike\" and with an thunderous "
					+ "crack lightning arcs from pikachu to the wolf and it drops over dead!!!", " ");
			gc.showDialog("As you rush forward to congrajulate your pet it turns to you with rage in its eyes from years of "
					+ "confinement in a tiny pokeball and, with a crackle of electric energy, it fries you to a crisp. You lose.", "Mmmm Crisps" );
			}
			if (pet.equals("A")) {gc.showDialog("Your cowardly pet lion looks at you and runs the opposite direction, back "
					+ "towards the village. The wolf charges and eats you", "You Lose");
			}
			if (pet.equals("C")) {gc.showDialog("The owl majestically swoops down towards the wolf and gets snatched out of the air by the "
					+ "wolfs hungry jaws, you have to turn away as you beloved pet is now dog chow, \nunfortunately as you turn away the "
					+ "wolf attacks and manages to overwhelm you. You are dead.", "On the bright side the wolf is so full after eating you that the sheep survive.");
			}
			break;

		case "B":
			if (pet.equals("A") && w.equals("B")) {
				gc.showDialog("You raise your sword in the air and "
						+ "shout \"BY THE POWER OF GREYSKULL, I HAVE THE POWER!!!\" Lightning flashes and you are suddenly "
						+ "transformed into a giant known only as \n He-Man, your cowardly pet lion grows into the "
						+ "mighty form of Battle Cat! You climb atop of your fearless pet and together you charge the wolf, "
						+ "which promptly sprints in the opposite direction.", "He-Man");
				win = true;
				//TODO make wolf in sheeps clothing path
			}
			else {
				gc.showDialog("You stand tall and shout \"I HAVE THE POWER\" which unfortunately scares the bejeezers out of the"
						+ " sheep which stampede and trample you into the dust. \nYou are dead.", "Did you really think that would"
								+ " work?");
			}
			break;

		case "C":
			if (pet.equals("C")) {
				gc.showDialog("You call a time out with the wolf and sit down to quickly write a letter while the wolf and you share some "
						+ "lemonade, the wolf then sets up a game of cards\n while you attach the letter to your owl, Hedwigs, leg.", "Time Out");
				gc.showDialog("As you wait you lose all the games of blackjack with the wolf and he quickly begin \"fleecing\" "
						+ "the sheep as well", "Still Waiting....");
				if (Ct1.equals("E")){
					//TODO make harry potter scabbers/ sirius path
					gc.showDialog("Path not available sry", "ERROR");
				}
				else {
					gc.showDialog("After waiting for an hour or two you decide that noone is coming to help you and prepare to "
							+ "fight the wolf on your own", "Battle Time!");
					gc.showDialog("You and the wolf face off aginst eachother, you draw your weapon and attack, you manage to "
							+ "slay the wolf and stand over its corpse in victory.\n Unfortunately you are then beaten to death "
							+ "by the mafia for unpaid gambling debts. You lose.", "House of The Rising Sun" );
				}
			}
			else {
				gc.showDialog("You call for help at the top of your lungs, and fortunately a nearby hunter hears you. he runs towards you to help and cuts the wolf open from head to tail. Lo and behold a little girl and her grandmother fall out.", "Saved!");
				gc.showDialog("Unfortunately no \"living\" being would be able to survive that and as you watch them get up you "
						+ "realize theres something off abou them, \nunfortunately its too late for you and the hunter as they devour "
						+ "you alive. Maybe it was the red hood or the exposed part of the grandmothers brain?", "Little Red Rotting "
								+ "Hood" );	
			}

			break;

		case "D":
			gc.showDialog("You sprint away at top speed, unfortunately it turns out that wolfs are faster than humans and it "
					+ "doesnt take long to outpace you, fortunately for you the wolf stops to take a nap halfway through the "
					+ "race and you just manage to get ahead of it and win the race. \nUnfortunately you die from old age "
					+ "after winning the race. You Lose.", "Slow and Steady");

			break;
		}



		if (win = true) { 
			String replay = gc.showInputDialog("You Win", "Play again?");
			if (replay == null){ System.exit(0);}
			else { 
				gameselect();
			}

		}

		else {
			String replay = gc.showInputDialog("You Lose!!! Try again?", "GG");
			if (replay == null){ System.exit(0);}
			else { 
				gameselect();
			}
		}

	}


	static String gameselect() {
		String game = gc.showInputDialog("Which game would you like to play today, Action or Adventure?", "Greetings " + name);


		if(game == null){ //handle CANCEL option
			System.out.println("Cancel pressed");
			System.exit(0);
		}
		return game;
	}



	static void drawActionGraphics() {
		//	gc.clear();


		//Tree
		//int rwl = 200;
		//int tp1 = 150;
		//int tp2 = 300;
		//int tp3 = 225;
		int rwl = 50;
		int tp1 = 0;
		int tp2 = 150;
		int tp3 = 75;
		for (int w = 0; w <=5; w = w ++) {
			Color myBrown = new Color(102, 51, 0); gc.setColor(myBrown);
			gc.fillRect(rwl, 900, 50, 150);

			Polygon triangle = new Polygon();
			triangle.addPoint(tp1, 900);
			triangle.addPoint(tp2, 900);
			triangle.addPoint(tp3, 700);
			gc.setColor(Color.GREEN);
			gc.fillPolygon(triangle);
			rwl = rwl + 175;
			tp1 = tp1 + 175;
			tp2 = tp2 + 175;
			tp3 = tp3 + 175;
		}
		for(int i = 0; i <= 20; i = i ++) {
			gc.setColor(Color.YELLOW);
			//Sun rise
			int sry = 90;
			int srx	= 275;
			gc.fillOval(sry, srx, 100, 100);
			gc.fillOval(700, 8, 100, 100);
			//sry = sry + 50;
			//srx = srx - 10;
		}
	}
	static void dialog() {
		name = gc.showInputDialog("What is your name?", "Welcome Player");
		if(name == null){ //handle CANCEL option
			System.out.println("Cancel pressed");
			System.exit(0); //or do something else
		}
		//handle OK option with no text
		if (name.equals("")) name = "John";
	}

}
