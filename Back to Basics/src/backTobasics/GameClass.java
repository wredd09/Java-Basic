package backTobasics;

import java.util.Scanner;

public class GameClass {

	private Scanner scanner;
	
	public GameClass ()	{
		scanner = new Scanner(System.in);
	}
	
	public boolean PromptToPlay () 	{
		System.out.println("Do you want to play the number game? "
				+ "(enter Y for yes, or anyhting else for no)");
		String user_input = scanner.nextLine();
		if (user_input.equalsIgnoreCase("Y"))	{
			return true;
		}
		return false;
	}

	public void play() {
		int low, high, guesses;
		System.out.println("What do you want set as your low number?");
		low = scanner.nextInt(); 
		scanner.nextLine();
		System.out.println("What do you want to set as your high number?");
		high = scanner.nextInt();
		scanner.nextLine();
		System.out.println();
	
	}
}
