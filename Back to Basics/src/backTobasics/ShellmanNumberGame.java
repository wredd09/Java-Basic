package backTobasics;

public class ShellmanNumberGame extends NumberGame {

	public ShellmanNumberGame () {
		
	}
	
	public void play() {
		System.out.println("Think of a number between 1 and 100 (inclusive).");
		System.out.println("Are you ready? (Enter anything when you are ready)");
		scanner.nextLine();
		
		int low = 1, high = 100, num_tries = 1;
		String user_input = "";
		boolean correct = false, bad_input = false;
		
		while (!correct)
		{
			System.out.println("Is your number " + guess(low, high) + "?");
			System.out.println("Enter y if yes, or anything else if no.");
			
			user_input = scanner.nextLine();
			
			if (user_input.trim().equalsIgnoreCase("Y"))
			{
				System.out.println("The computer took " + num_tries + " tries to guess your number.");
				correct = true;
			} else if (low == high) {
				System.out.println("There are no more options to guess.");
				System.out.print("You must have either picked a number outside of the range or ");
				System.out.println(" incorrectly input an h or l during the game.");
				break;
			} else {
				bad_input = false;
				do {
					if (bad_input) {
						System.out.println("That is an invalid input. Please try again.");
					}
					System.out.println("Please enter H if your number is higher and l if it is lower.");
					user_input = scanner.nextLine();
					if (!user_input.trim().equalsIgnoreCase("H") && !user_input.trim().equalsIgnoreCase("L")) {
						bad_input = true;
					} else {
						bad_input = false;
					}
				} while (bad_input);
				
				if (user_input.trim().equalsIgnoreCase("H")) {
					low = guess(low, high) + 1;
				} else {
					high = guess(low, high) - 1;
				}
			}
			num_tries++;
		}
	}
	
	private int guess(int low, int high)
	{
		return (high - low + 1)/2 + low;
	}
}
