package backTobasics;

import java.util.Scanner;

public class GameClass {

	private Scanner in;
	
	public GameClass ()	{
		in = new Scanner(System.in);
	}
	
	public boolean PromptToPlay (boolean i) 	{
		System.out.println("Do you want to play the number game? (enter Y for yes, or anyhting else for no)");
		String user_input = in.nextLine();
		if (user_input.equalsIgnoreCase("Y"))	{
			return true;
		}
		return false;
	}

}
