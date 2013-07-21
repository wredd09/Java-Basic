package backTobasics;

import java.util.Scanner;

public class GameLauncher {
	
	public static void main(String[] args) {
		
		NumberGame ng = new NumberGame();
		Scanner scanner = new Scanner(System.in);
		String user_input = "";
		boolean test = false;
		
		while (ng.PromptToPlay()) {
			do
			{
				if (test) {
					System.out.println("The input you entered is invalid please try again.");
				}
				test = false;
				System.out.println("Which version of the Number Game would you like to play?");
				System.out.println("Enter W for Will's version or I for Ian's.");
				user_input = scanner.nextLine();
				if (!user_input.equalsIgnoreCase("W") && !user_input.equalsIgnoreCase("I")) {
					test = true;
				}
			} while (test);
			
			if (user_input.equalsIgnoreCase("W")) {
				ng = new ReddNumberGame();
			} else {
				ng = new ShellmanNumberGame();
			}
			ng.play();
		};
		System.exit(0);
	}
}
