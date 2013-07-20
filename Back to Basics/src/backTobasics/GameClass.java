package backTobasics;

import java.util.Scanner;

public class GameClass {

	private Scanner scanner;
	
	public GameClass ()	{
		scanner = new Scanner(System.in);
	}
	
	public boolean PromptToPlay (boolean i) 	{
		System.out.println("Do you want to play the number game? (enter Y for yes, or anyhting else for no)");
		String user_input = scanner.nextLine();
		if (user_input.equalsIgnoreCase("Y"))	{
			return true;
		}
		return false;
	}

	public void play() {
		System.out.println("Think of a number between 0 and 100");
		System.out.println("Are you ready?");
		
	}
}
