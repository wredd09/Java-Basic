package backTobasics;

import java.util.*;


public class GameClass {

	private Scanner scanner;
	private Random random;
	
	public GameClass ()	{
		scanner = new Scanner(System.in);
		random = new Random();
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
		int randomnumber = 0;
		randomnumber = numbergenerator(randomnumber);
		System.out.println("random number is " + randomnumber);
	}
	
	public int numbergenerator (int randomnumber) {
		int low, high;
		System.out.println("What do you want set as your low number?");
		low = scanner.nextInt(); 
		//scanner.nextLine();
		System.out.println("What do you want to set as your high number?");
		high = scanner.nextInt();
		//scanner.nextLine();
		System.out.println();
		randomnumber = random.nextInt(high - low + 1); //WHOOOOO Comments
		randomnumber = randomnumber + low;
		return randomnumber;
	}
	
}
