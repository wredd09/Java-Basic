package backTobasics;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	protected Scanner scanner;
	protected Random random;
	
	public NumberGame() {
		scanner = new Scanner(System.in);
	}
	
	public boolean PromptToPlay () 	{
		System.out.println("Do you want to play the number game? "
				+ "(enter Y for yes, or anything else for no)");
		String user_input = scanner.nextLine();
		if (user_input.equalsIgnoreCase("Y"))	{
			return true;
		}
		return false;
	}
	
	public void play() {
		/* To be filled in in each child class */
	}
}
