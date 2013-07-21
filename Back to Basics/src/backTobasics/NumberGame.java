package backTobasics;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	protected Scanner scanner;
	protected Random random;
	
	public NumberGame() {
		scanner = new Scanner(System.in);
		random = new Random();
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
	
	protected int getIntFromUser() {
		int userInt = 0;
		boolean successful = true;
		
		do {
			try {
				userInt = Integer.parseInt(scanner.nextLine());
				successful = true;
			} catch (Exception e) {
				successful = false;
				System.out.println("That was an invalid input for an integer. ");
			}
		} while (!successful);
		
		return userInt;
	}
}
