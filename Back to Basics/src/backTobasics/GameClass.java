package backTobasics;

import java.util.*;

public class GameClass {

	public static void main(String[] args) {
		Scanner scanner;
		Random random;
		scanner = new Scanner(System.in);
		random = new Random();
		if (PromptToPlay(scanner)) {
			play(scanner, random);
		} else {
			System.out.println("Goodbye");
		}

	}

	public static boolean PromptToPlay(Scanner scanner) {
		System.out.println("Do you want to play the number game? "
				+ "(enter Y for yes, or anything else for no)");
		String user_input = scanner.nextLine();
		if (user_input.equalsIgnoreCase("Y")) {
			return true;
		}
		return false;
	}

	public static void play(Scanner scanner, Random random) {
		int randomnumber = numbergenerator(scanner, random);
		// System.out.println("random number is " + randomnumber);
		int guesses = actualgame(randomnumber, scanner);
		System.out.println("It took you " + guesses + " Guesses");
	}

	public static int numbergenerator(Scanner scanner, Random random) {
		int low, high, randomnumber;
		System.out.println("What do you want set as your low number?");
		low = scanner.nextInt();
		// scanner.nextLine();
		System.out.println("What do you want to set as your high number?");
		high = scanner.nextInt();
		// scanner.nextLine();
		System.out.println("low is " + low + ". High is " + high);
		randomnumber = random.nextInt(high - low + 1); // WHOOOOO Comments
		randomnumber = randomnumber + low;
		return randomnumber;
	}

	public static int actualgame(int randomnumber, Scanner scanner) {
		int guess = 0;
		int guesses = 0;
		System.out.print("Guess a number ");
		guess = scanner.nextInt();
		System.out.println();
		if (guess == randomnumber) {
			guesses++;
			System.out.println("Lucky Guess!");
			return guesses;
		} else {
			do {
				guesses++;
				if (guess < randomnumber) {
					System.out.print("Too low. Guess again ");
					guess = scanner.nextInt();
					System.out.println();
				} else if (guess > randomnumber) {
					System.out.print("Too high. Guess again ");
					guess = scanner.nextInt();
					System.out.println();
				}
			} while (guess != randomnumber);
		}

		if (guess == randomnumber) {
			guesses++;
			System.out.println("Got it!");
		}
		return guesses;
	}
}
