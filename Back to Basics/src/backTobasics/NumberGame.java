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
				+ "(enter Y or Yes for yes, or anything else for no)");
		String user_input = scanner.nextLine();
		if (user_input.trim().equalsIgnoreCase("Y") || user_input.trim().equalsIgnoreCase("Yes"))	{
			return true;
		}
		return false;
	}
	
	public void play() {
		/* To be filled in in each child class */
	}
}
