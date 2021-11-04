package unit1;

public class Randomnumbers {

	public static void main(String[] args) throws InterruptedException{
		Thread.sleep(750);
		random1();
		System.out.println();
		random2();
		Thread.sleep(750);
		System.out.println();
		dice1();
		Thread.sleep(750);
		System.out.println();
		dice2();
	}

	static void random1() {

		int n = 200;
		for (int i = 1; i <=20; i++) {
			int r = (int)(Math.random() * n) + 1;
			System.out.print(r + " ");
		}
	}


	static void random2() {
		int max = 600;
		int min = 1;
		int range = max - min +1;
		int r = (int)(Math.random() * range) + min;
		System.out.println(r);
	}
	
	static void dice1() {
		int n = 6;
		int roll = 0;
		for (int i = 0; i <=20; i++) {
		int r = (int)(Math.random() * n) + 1;
		if (roll == 3) {roll = roll + 1;}
		}
		System.out.print(roll);
	}

	static void dice2() {
		int n = 6;
		int r1 = 0;	//number of ones
		int w2 = 0;	//number of twos
		int w3 = 0;	//number of threes
		int w4 = 0;	//number of fours
		int w5 = 0;	//number of fives
		int w6 = 0; // number of sixes
		for (int i = 0; i <=600; i++) {
			int r = (int)(Math.random() * n) + 1;
		
			if (r == 1) {r1 = r1 + 1;} 
			if (r == 2) {w2 = w2 + 1;} 
			if (r == 3) {w3 = w3 + 1;}
			if (r == 4) {w4 = w4 + 1;} 
			if (r == 5) {w5 = w5 + 1;} 
			if (r == 6) {w6 = w6 + 1;} 
		}
		System.out.println("There are " + r1 + " ones.");
		System.out.println("There are " + w2 + " twos.");
		System.out.println("There are " + w3 + " threes.");
		System.out.println("There are " + w4 + " fours.");
		System.out.println("There are " + w5 + " fives.");
		System.out.println("There are " + w6 + " sixes.");

	}
	static void two67() {
		int n = 100;
		int two76 = 0;
	for (int i = 0; i <=600; i++) {
		int r = (int)(Math.random() * n) + 1;
		
	}
	}
}
