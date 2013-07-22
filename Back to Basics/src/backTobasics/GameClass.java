package backTobasics;

import java.util.*;

public class GameClass {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		if (promptToPlay()) {
			play();
			while (playAgain()) {
				play();
			}
		}
		System.out.println("Goodbye");	
	}

	public static boolean promptToPlay() {
		System.out.println("Do you want to play the number game?");
		String user_input = scanner.nextLine();
		if (Character.toUpperCase(user_input.charAt(0))== 'Y') {
			return true;
		}
		return false;
	}
	
	public static boolean playAgain() {
		System.out.println("Would you like to play again?");
		String user_input = scanner.nextLine();
		if (Character.toUpperCase(user_input.charAt(0))== 'Y') {
			System.out.println("");
			return true;
		}
		return false;
	}
	
	public static int getInt() {
		int userInt = 0;
		boolean successful = true;
		do {
			try {
				userInt = Integer.parseInt(scanner.nextLine());
				successful = true;
			} catch (Exception e) {
				successful = false;
				System.out.println("That is not valid. Please enter an integer.");
			}
		} while (!successful);
		return userInt;
	}

	public static void play() {
		Random random = new Random();
		int [] randlowhigh = numbergenerator(random);
		// next line is debug only
		System.out.println("rand low high " + randlowhigh[0] + " " + randlowhigh [1] 
				+ " " + randlowhigh [2]);
		int guesses = actualgame(randlowhigh);
		if (guesses > 1) {
			System.out.println("It took you " + guesses + " guesses.");
		}
	}

	public static int [] numbergenerator(Random random) {
		int low = 0, high = 0;
		int [] randlowhigh = new int [3];
		System.out.println("What do you want set as your low number?");
		low = getInt();
		System.out.println("What do you want to set as your high number?");
		do {
			high = getInt();
			if (high <= low){
				System.out.println("Please enter a number larger than your low value");
			}
		} while (high <= low);
		
		int randomnumber = random.nextInt(high - low + 1); // WHOOOOO Comments
		randomnumber = randomnumber + low;
		randlowhigh[0] = randomnumber;
		randlowhigh[1] = low;
		randlowhigh[2] = high;
		return randlowhigh ;
	}

	public static int actualgame(int[] randlowhigh) {
		int guess = 0, guesses = 0;
		int [] currentlohi = new int [2];
		currentlohi[0] = randlowhigh[1] - 1;
		currentlohi[1] = randlowhigh[2] + 1;
		System.out.print("Guess a number ");
		guess = getInt();
		System.out.println();
		if (guess == randlowhigh[0]) {
			guesses++;
			System.out.println("Lucky Guess!");
			System.out.println();
			return guesses;
		} else {
			do {
				if (guess > currentlohi[0] && guess < currentlohi[1]){
					if (guess < randlowhigh[0]) {
						System.out.print("Too low. Guess again ");
						currentlohi[0] = guess;
						System.out.println();
					} else if (guess > randlowhigh[0]) {
						System.out.print("Too high. Guess again ");
						currentlohi[1] = guess;
						System.out.println();
					}
					guesses++;
					
				} else if (guess < randlowhigh[1] || guess > randlowhigh[2]){
					System.out.println("Guess was out of original range. Guess again.");
				} else if (guess <= currentlohi[0] && currentlohi[0] != randlowhigh [1]){
					System.out.println("I've already told you the number is greater than " 
							+ currentlohi[0]);
				} else if (guess >= currentlohi[1] && currentlohi[1] != randlowhigh [2]){
					System.out.println("I've already told you the number is less than " 
							+ currentlohi[1]);
				}
				
				guess = getInt();
				
			} while (guess != randlowhigh[0]);
		}

		if (guess == randlowhigh[0]) {
			guesses++;
			System.out.println("Got it!");
		}
		return guesses;
	}
	
	public static boolean isValid(int guess, int[] randlowhigh, int[] currenthilo){
		if (guess < randlowhigh[1] || guess > randlowhigh[2]) {
			do {
				System.out.println("Guess was out of range. Guess Again");
				guess = getInt();
			} while (guess < randlowhigh[1] || guess > randlowhigh[2]);
		}
		return false;
		
	}
}
